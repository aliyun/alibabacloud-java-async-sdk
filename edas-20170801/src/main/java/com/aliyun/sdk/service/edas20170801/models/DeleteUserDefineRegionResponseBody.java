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
 * {@link DeleteUserDefineRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUserDefineRegionResponseBody</p>
 */
public class DeleteUserDefineRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RegionDefine")
    private RegionDefine regionDefine;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteUserDefineRegionResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.regionDefine = builder.regionDefine;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserDefineRegionResponseBody create() {
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
     * @return regionDefine
     */
    public RegionDefine getRegionDefine() {
        return this.regionDefine;
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
        private RegionDefine regionDefine; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteUserDefineRegionResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.regionDefine = model.regionDefine;
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
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The custom namespace.</p>
         */
        public Builder regionDefine(RegionDefine regionDefine) {
            this.regionDefine = regionDefine;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1234-1sda-321d-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteUserDefineRegionResponseBody build() {
            return new DeleteUserDefineRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteUserDefineRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteUserDefineRegionResponseBody</p>
     */
    public static class RegionDefine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongRegion")
        private String belongRegion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private RegionDefine(Builder builder) {
            this.belongRegion = builder.belongRegion;
            this.description = builder.description;
            this.id = builder.id;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionDefine create() {
            return builder().build();
        }

        /**
         * @return belongRegion
         */
        public String getBelongRegion() {
            return this.belongRegion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String belongRegion; 
            private String description; 
            private Long id; 
            private String regionId; 
            private String regionName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(RegionDefine model) {
                this.belongRegion = model.belongRegion;
                this.description = model.description;
                this.id = model.id;
                this.regionId = model.regionId;
                this.regionName = model.regionName;
                this.userId = model.userId;
            } 

            /**
             * <p>The ID of the region to which the custom namespace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * <p>The description of the custom namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>logic region</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique identifier of the custom namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>8848</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the custom namespace. The ID cannot be changed after the custom namespace is created. The format is <code>region ID:custom namespace ID</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing:test</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the custom namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test_region</p>
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the custom namespace belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>11727****22398</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public RegionDefine build() {
                return new RegionDefine(this);
            } 

        } 

    }
}
