// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMigrateRegionListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMigrateRegionListResponseBody</p>
 */
public class QueryMigrateRegionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RegionEntityList")
    private RegionEntityList regionEntityList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryMigrateRegionListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.regionEntityList = model.regionEntityList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The namespaces.</p>
         */
        public Builder regionEntityList(RegionEntityList regionEntityList) {
            this.regionEntityList = regionEntityList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-7ca7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMigrateRegionListResponseBody build() {
            return new QueryMigrateRegionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMigrateRegionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMigrateRegionListResponseBody</p>
     */
    public static class RegionEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
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

            private Builder() {
            } 

            private Builder(RegionEntity model) {
                this.regionName = model.regionName;
                this.regionNo = model.regionNo;
            } 

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>Beta</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:beta</p>
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
    /**
     * 
     * {@link QueryMigrateRegionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMigrateRegionListResponseBody</p>
     */
    public static class RegionEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionEntity")
        private java.util.List<RegionEntity> regionEntity;

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
        public java.util.List<RegionEntity> getRegionEntity() {
            return this.regionEntity;
        }

        public static final class Builder {
            private java.util.List<RegionEntity> regionEntity; 

            private Builder() {
            } 

            private Builder(RegionEntityList model) {
                this.regionEntity = model.regionEntity;
            } 

            /**
             * RegionEntity.
             */
            public Builder regionEntity(java.util.List<RegionEntity> regionEntity) {
                this.regionEntity = regionEntity;
                return this;
            }

            public RegionEntityList build() {
                return new RegionEntityList(this);
            } 

        } 

    }
}
