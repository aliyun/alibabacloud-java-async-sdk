// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>ListSpaceResponseBody</p>
 */
public class ListSpaceResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Spaces")
    private java.util.List < Spaces> spaces;

    private ListSpaceResponseBody(Builder builder) {
        this.count = builder.count;
        this.gmtCreate = builder.gmtCreate;
        this.requestId = builder.requestId;
        this.spaces = builder.spaces;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSpaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return spaces
     */
    public java.util.List < Spaces> getSpaces() {
        return this.spaces;
    }

    public static final class Builder {
        private Integer count; 
        private String gmtCreate; 
        private String requestId; 
        private java.util.List < Spaces> spaces; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Spaces.
         */
        public Builder spaces(java.util.List < Spaces> spaces) {
            this.spaces = spaces;
            return this;
        }

        public ListSpaceResponseBody build() {
            return new ListSpaceResponseBody(this);
        } 

    } 

    public static class Spaces extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtLastAccess")
        private Long gmtLastAccess;

        @NameInMap("Name")
        private String name;

        @NameInMap("SpaceId")
        private String spaceId;

        @NameInMap("Status")
        private String status;

        private Spaces(Builder builder) {
            this.desc = builder.desc;
            this.gmtCreate = builder.gmtCreate;
            this.gmtLastAccess = builder.gmtLastAccess;
            this.name = builder.name;
            this.spaceId = builder.spaceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spaces create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtLastAccess
         */
        public Long getGmtLastAccess() {
            return this.gmtLastAccess;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String desc; 
            private Long gmtCreate; 
            private Long gmtLastAccess; 
            private String name; 
            private String spaceId; 
            private String status; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtLastAccess.
             */
            public Builder gmtLastAccess(Long gmtLastAccess) {
                this.gmtLastAccess = gmtLastAccess;
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
             * SpaceId.
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Spaces build() {
                return new Spaces(this);
            } 

        } 

    }
}
