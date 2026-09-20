// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link GetSkillVersionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillVersionDetailResponseBody</p>
 */
public class GetSkillVersionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSkillVersionDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillVersionDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSkillVersionDetailResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information about the Skill version.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The unique identifier that Alibaba Cloud generated for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3EF4C9EC-0D5B-5AD6-8585-4D2AAA22B1E3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSkillVersionDetailResponseBody build() {
            return new GetSkillVersionDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillVersionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillVersionDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private java.util.Map<String, DataResourceValue> resource;

        @com.aliyun.core.annotation.NameInMap("SkillMd")
        private String skillMd;

        private Data(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.namespaceId = builder.namespaceId;
            this.resource = builder.resource;
            this.skillMd = builder.skillMd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return resource
         */
        public java.util.Map<String, DataResourceValue> getResource() {
            return this.resource;
        }

        /**
         * @return skillMd
         */
        public String getSkillMd() {
            return this.skillMd;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String namespaceId; 
            private java.util.Map<String, DataResourceValue> resource; 
            private String skillMd; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.name = model.name;
                this.namespaceId = model.namespaceId;
                this.resource = model.resource;
                this.skillMd = model.skillMd;
            } 

            /**
             * <p>The description of the Skill for the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>secret for bbtadmin</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The Skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>BusinessModel</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace ID to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>f52aea1c-774e-4cc1-9dd1-d91432484d44</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The resource mapping (key is the resource name).</p>
             */
            public Builder resource(java.util.Map<String, DataResourceValue> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>The Skill card content (SKILL.md).</p>
             * 
             * <strong>example:</strong>
             * <hr>
             * <h2>name: hello-world
             * description: Say hello to users</h2>
             * <p>Hello World Skill</p>
             */
            public Builder skillMd(String skillMd) {
                this.skillMd = skillMd;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
