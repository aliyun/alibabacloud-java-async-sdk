// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
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
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("resource")
        private java.util.Map<String, DataResourceValue> resource;

        @com.aliyun.core.annotation.NameInMap("skillMd")
        private String skillMd;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private Data(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.resource = builder.resource;
            this.skillMd = builder.skillMd;
            this.workspaceId = builder.workspaceId;
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

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private java.util.Map<String, DataResourceValue> resource; 
            private String skillMd; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.description = model.description;
                this.name = model.name;
                this.resource = model.resource;
                this.skillMd = model.skillMd;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * resource.
             */
            public Builder resource(java.util.Map<String, DataResourceValue> resource) {
                this.resource = resource;
                return this;
            }

            /**
             * skillMd.
             */
            public Builder skillMd(String skillMd) {
                this.skillMd = skillMd;
                return this;
            }

            /**
             * workspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
