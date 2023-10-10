// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAliyunRegionResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliyunRegionResponseBody</p>
 */
public class ListAliyunRegionResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RegionEntityList")
    private RegionEntityList regionEntityList;

    @NameInMap("RequestId")
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
         * The details of the regions.
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

        public ListAliyunRegionResponseBody build() {
            return new ListAliyunRegionResponseBody(this);
        } 

    } 

    public static class RegionEntity extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
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

            /**
             * The ID of the region.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the region.
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
