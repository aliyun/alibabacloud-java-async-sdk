// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMigrateRegionListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMigrateRegionListResponseBody</p>
 */
public class QueryMigrateRegionListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RegionEntityList")
    private RegionEntityList regionEntityList;

    @NameInMap("RequestId")
    private String requestId;

    private QueryMigrateRegionListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.regionEntityList = builder.regionEntityList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMigrateRegionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return regionEntityList
     */
    public RegionEntityList getRegionEntityList() {
        return this.regionEntityList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private RegionEntityList regionEntityList; 
        private String requestId; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The namespaces.
         */
        public Builder regionEntityList(RegionEntityList regionEntityList) {
            this.regionEntityList = regionEntityList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMigrateRegionListResponseBody build() {
            return new QueryMigrateRegionListResponseBody(this);
        } 

    } 

    public static class RegionEntity extends TeaModel {
        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("RegionNo")
        private String regionNo;

        private RegionEntity(Builder builder) {
            this.regionName = builder.regionName;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionEntity create() {
            return builder().build();
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private String regionName; 
            private String regionNo; 

            /**
             * The name of the namespace.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public RegionEntity build() {
                return new RegionEntity(this);
            } 

        } 

    }
    public static class RegionEntityList extends TeaModel {
        @NameInMap("RegionEntity")
        private java.util.List < RegionEntity> regionEntity;

        private RegionEntityList(Builder builder) {
            this.regionEntity = builder.regionEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionEntityList create() {
            return builder().build();
        }

        /**
         * @return regionEntity
         */
        public java.util.List < RegionEntity> getRegionEntity() {
            return this.regionEntity;
        }

        public static final class Builder {
            private java.util.List < RegionEntity> regionEntity; 

            /**
             * RegionEntity.
             */
            public Builder regionEntity(java.util.List < RegionEntity> regionEntity) {
                this.regionEntity = regionEntity;
                return this;
            }

            public RegionEntityList build() {
                return new RegionEntityList(this);
            } 

        } 

    }
}
