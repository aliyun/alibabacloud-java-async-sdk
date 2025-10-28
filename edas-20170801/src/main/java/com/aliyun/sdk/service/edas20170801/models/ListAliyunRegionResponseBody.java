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
 * {@link ListAliyunRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliyunRegionResponseBody</p>
 */
public class ListAliyunRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RegionEntityList")
    private RegionEntityList regionEntityList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAliyunRegionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.regionEntityList = builder.regionEntityList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliyunRegionResponseBody create() {
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

        private Builder(ListAliyunRegionResponseBody model) {
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
         * <p>The details of the regions.</p>
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

        public ListAliyunRegionResponseBody build() {
            return new ListAliyunRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAliyunRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliyunRegionResponseBody</p>
     */
    public static class RegionEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RegionEntity(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionEntity create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(RegionEntity model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>China East 1 (Hangzhou)</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RegionEntity build() {
                return new RegionEntity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAliyunRegionResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliyunRegionResponseBody</p>
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
