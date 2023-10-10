// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserDefineRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUserDefineRegionResponseBody</p>
 */
public class DeleteUserDefineRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RegionDefine")
    private RegionDefine regionDefine;

    @NameInMap("RequestId")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The custom namespace.
         */
        public Builder regionDefine(RegionDefine regionDefine) {
            this.regionDefine = regionDefine;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteUserDefineRegionResponseBody build() {
            return new DeleteUserDefineRegionResponseBody(this);
        } 

    } 

    public static class RegionDefine extends TeaModel {
        @NameInMap("BelongRegion")
        private String belongRegion;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("UserId")
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

            /**
             * The ID of the region to which the custom namespace belongs.
             */
            public Builder belongRegion(String belongRegion) {
                this.belongRegion = belongRegion;
                return this;
            }

            /**
             * The description of the custom namespace.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The unique identifier of the custom namespace.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the custom namespace. The ID cannot be changed after the custom namespace is created. The format is `region ID:custom namespace ID`.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the custom namespace.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the custom namespace belongs.
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
