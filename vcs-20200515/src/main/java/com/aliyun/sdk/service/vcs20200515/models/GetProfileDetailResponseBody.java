// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProfileDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetProfileDetailResponseBody</p>
 */
public class GetProfileDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetProfileDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProfileDetailResponseBody create() {
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

        public GetProfileDetailResponseBody build() {
            return new GetProfileDetailResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
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

        @NameInMap("LiveAddress")
        private String liveAddress;

        @NameInMap("Name")
        private String name;

        @NameInMap("PersonId")
        private String personId;

        @NameInMap("PhoneNo")
        private String phoneNo;

        @NameInMap("PlateNo")
        private String plateNo;

        @NameInMap("ProfileId")
        private Integer profileId;

        @NameInMap("SceneType")
        private String sceneType;

        private Data(Builder builder) {
            this.bizId = builder.bizId;
            this.catalogId = builder.catalogId;
            this.faceUrl = builder.faceUrl;
            this.gender = builder.gender;
            this.idNumber = builder.idNumber;
            this.isvSubId = builder.isvSubId;
            this.liveAddress = builder.liveAddress;
            this.name = builder.name;
            this.personId = builder.personId;
            this.phoneNo = builder.phoneNo;
            this.plateNo = builder.plateNo;
            this.profileId = builder.profileId;
            this.sceneType = builder.sceneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return liveAddress
         */
        public String getLiveAddress() {
            return this.liveAddress;
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
         * @return phoneNo
         */
        public String getPhoneNo() {
            return this.phoneNo;
        }

        /**
         * @return plateNo
         */
        public String getPlateNo() {
            return this.plateNo;
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

        public static final class Builder {
            private String bizId; 
            private Integer catalogId; 
            private String faceUrl; 
            private String gender; 
            private String idNumber; 
            private String isvSubId; 
            private String liveAddress; 
            private String name; 
            private String personId; 
            private String phoneNo; 
            private String plateNo; 
            private Integer profileId; 
            private String sceneType; 

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
             * LiveAddress.
             */
            public Builder liveAddress(String liveAddress) {
                this.liveAddress = liveAddress;
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
             * PhoneNo.
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * PlateNo.
             */
            public Builder plateNo(String plateNo) {
                this.plateNo = plateNo;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
