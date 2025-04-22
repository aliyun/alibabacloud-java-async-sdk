// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateWorkspaceResourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkspaceResourceResponseBody</p>
 */
public class CreateWorkspaceResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private java.util.List<Resources> resources;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private CreateWorkspaceResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceResourceResponseBody create() {
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
     * @return resources
     */
    public java.util.List<Resources> getResources() {
        return this.resources;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Resources> resources; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(CreateWorkspaceResourceResponseBody model) {
            this.requestId = model.requestId;
            this.resources = model.resources;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1e195c5116124202371861018d5bde</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources.</p>
         */
        public Builder resources(java.util.List<Resources> resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The total number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public CreateWorkspaceResourceResponseBody build() {
            return new CreateWorkspaceResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkspaceResourceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWorkspaceResourceResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Resources(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            private Builder() {
            } 

            private Builder(Resources model) {
                this.id = model.id;
            } 

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
