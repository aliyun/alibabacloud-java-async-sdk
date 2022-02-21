// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProfileListResponseBody} extends {@link TeaModel}
 *
 * <p>GetProfileListResponseBody</p>
 */
public class GetProfileListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetProfileListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProfileListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProfileListResponseBody build() {
            return new GetProfileListResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("CatalogId")
        private Integer catalogId;

        @NameInMap("FaceUrl")
        private String faceUrl;

        @NameInMap("Gender")
        private String gender;

        @NameInMap("IdNumber")
        private String idNumber;

        @NameInMap("IsvSubId")
        private String isvSubId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("ProfileId")
        private Integer profileId;

        @NameInMap("SceneType")
        private String sceneType;

        @NameInMap("SearchMatchingRate")
        private String searchMatchingRate;

        private Records(Builder builder) {
            this.bizId = builder.bizId;
            this.catalogId = builder.catalogId;
            this.faceUrl = builder.faceUrl;
            this.gender = builder.gender;
            this.idNumber = builder.idNumber;
            this.isvSubId = builder.isvSubId;
            this.name = builder.name;
            this.personId = builder.personId;
            this.profileId = builder.profileId;
            this.sceneType = builder.sceneType;
            this.searchMatchingRate = builder.searchMatchingRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return catalogId
         */
        public Integer getCatalogId() {
            return this.catalogId;
        }

        /**
         * @return faceUrl
         */
        public String getFaceUrl() {
            return this.faceUrl;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return idNumber
         */
        public String getIdNumber() {
            return this.idNumber;
        }

        /**
         * @return isvSubId
         */
        public String getIsvSubId() {
            return this.isvSubId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return personId
         */
        public String getPersonId() {
            return this.personId;
        }

        /**
         * @return profileId
         */
        public Integer getProfileId() {
            return this.profileId;
        }

        /**
         * @return sceneType
         */
        public String getSceneType() {
            return this.sceneType;
        }

        /**
         * @return searchMatchingRate
         */
        public String getSearchMatchingRate() {
            return this.searchMatchingRate;
        }

        public static final class Builder {
            private String bizId; 
            private Integer catalogId; 
            private String faceUrl; 
            private String gender; 
            private String idNumber; 
            private String isvSubId; 
            private String name; 
            private String personId; 
            private Integer profileId; 
            private String sceneType; 
            private String searchMatchingRate; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * CatalogId.
             */
            public Builder catalogId(Integer catalogId) {
                this.catalogId = catalogId;
                return this;
            }

            /**
             * FaceUrl.
             */
            public Builder faceUrl(String faceUrl) {
                this.faceUrl = faceUrl;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * IdNumber.
             */
            public Builder idNumber(String idNumber) {
                this.idNumber = idNumber;
                return this;
            }

            /**
             * IsvSubId.
             */
            public Builder isvSubId(String isvSubId) {
                this.isvSubId = isvSubId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PersonId.
             */
            public Builder personId(String personId) {
                this.personId = personId;
                return this;
            }

            /**
             * ProfileId.
             */
            public Builder profileId(Integer profileId) {
                this.profileId = profileId;
                return this;
            }

            /**
             * SceneType.
             */
            public Builder sceneType(String sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            /**
             * SearchMatchingRate.
             */
            public Builder searchMatchingRate(String searchMatchingRate) {
                this.searchMatchingRate = searchMatchingRate;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Boolean success; 
            private Long total; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
