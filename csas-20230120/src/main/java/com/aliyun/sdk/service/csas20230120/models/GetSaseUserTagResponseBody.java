// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetSaseUserTagResponseBody} extends {@link TeaModel}
 *
 * <p>GetSaseUserTagResponseBody</p>
 */
public class GetSaseUserTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaseUserTag")
    private SaseUserTag saseUserTag;

    private GetSaseUserTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.saseUserTag = builder.saseUserTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSaseUserTagResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saseUserTag
     */
    public SaseUserTag getSaseUserTag() {
        return this.saseUserTag;
    }

    public static final class Builder {
        private String requestId; 
        private SaseUserTag saseUserTag; 

        private Builder() {
        } 

        private Builder(GetSaseUserTagResponseBody model) {
            this.requestId = model.requestId;
            this.saseUserTag = model.saseUserTag;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SaseUserTag.
         */
        public Builder saseUserTag(SaseUserTag saseUserTag) {
            this.saseUserTag = saseUserTag;
            return this;
        }

        public GetSaseUserTagResponseBody build() {
            return new GetSaseUserTagResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSaseUserTagResponseBody} extends {@link TeaModel}
     *
     * <p>GetSaseUserTagResponseBody</p>
     */
    public static class SaseUserTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        private SaseUserTag(Builder builder) {
            this.aliuid = builder.aliuid;
            this.description = builder.description;
            this.name = builder.name;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaseUserTag create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private String aliuid; 
            private String description; 
            private String name; 
            private String tagId; 

            private Builder() {
            } 

            private Builder(SaseUserTag model) {
                this.aliuid = model.aliuid;
                this.description = model.description;
                this.name = model.name;
                this.tagId = model.tagId;
            } 

            /**
             * Aliuid.
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            public SaseUserTag build() {
                return new SaseUserTag(this);
            } 

        } 

    }
}
