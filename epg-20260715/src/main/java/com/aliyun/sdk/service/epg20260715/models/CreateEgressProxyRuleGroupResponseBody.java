// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.epg20260715.models;

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
 * {@link CreateEgressProxyRuleGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEgressProxyRuleGroupResponseBody</p>
 */
public class CreateEgressProxyRuleGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressProxyRuleGroupId")
    private String egressProxyRuleGroupId;

    @com.aliyun.core.annotation.NameInMap("EgressProxyRules")
    private EgressProxyRules egressProxyRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEgressProxyRuleGroupResponseBody(Builder builder) {
        this.egressProxyRuleGroupId = builder.egressProxyRuleGroupId;
        this.egressProxyRules = builder.egressProxyRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEgressProxyRuleGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return egressProxyRuleGroupId
     */
    public String getEgressProxyRuleGroupId() {
        return this.egressProxyRuleGroupId;
    }

    /**
     * @return egressProxyRules
     */
    public EgressProxyRules getEgressProxyRules() {
        return this.egressProxyRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String egressProxyRuleGroupId; 
        private EgressProxyRules egressProxyRules; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEgressProxyRuleGroupResponseBody model) {
            this.egressProxyRuleGroupId = model.egressProxyRuleGroupId;
            this.egressProxyRules = model.egressProxyRules;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the egress proxy rule group.</p>
         * 
         * <strong>example:</strong>
         * <p>eprg-uf60966a9633667c51d7</p>
         */
        public Builder egressProxyRuleGroupId(String egressProxyRuleGroupId) {
            this.egressProxyRuleGroupId = egressProxyRuleGroupId;
            return this;
        }

        /**
         * <p>The list of egress rules grouped by phase (PreDns, PreRequest, and PostResponse).</p>
         */
        public Builder egressProxyRules(EgressProxyRules egressProxyRules) {
            this.egressProxyRules = egressProxyRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019F3A67-2D1B-537B-B08D-B2DEB69E8E8B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEgressProxyRuleGroupResponseBody build() {
            return new CreateEgressProxyRuleGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateEgressProxyRuleGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRuleGroupResponseBody</p>
     */
    public static class PostResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleId")
        private String egressProxyRuleId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private PostResponse(Builder builder) {
            this.egressProxyRuleId = builder.egressProxyRuleId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostResponse create() {
            return builder().build();
        }

        /**
         * @return egressProxyRuleId
         */
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String egressProxyRuleId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PostResponse model) {
                this.egressProxyRuleId = model.egressProxyRuleId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the egress proxy rule.</p>
             * 
             * <strong>example:</strong>
             * <p>epr-g2w80bb6a91dbb775****</p>
             */
            public Builder egressProxyRuleId(String egressProxyRuleId) {
                this.egressProxyRuleId = egressProxyRuleId;
                return this;
            }

            /**
             * <p>The priority of the egress proxy rule in the stage to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public PostResponse build() {
                return new PostResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRuleGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRuleGroupResponseBody</p>
     */
    public static class PreDns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleId")
        private String egressProxyRuleId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private PreDns(Builder builder) {
            this.egressProxyRuleId = builder.egressProxyRuleId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreDns create() {
            return builder().build();
        }

        /**
         * @return egressProxyRuleId
         */
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String egressProxyRuleId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PreDns model) {
                this.egressProxyRuleId = model.egressProxyRuleId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the egress proxy rule.</p>
             * 
             * <strong>example:</strong>
             * <p>epr-gw80bb6a91dbb775****</p>
             */
            public Builder egressProxyRuleId(String egressProxyRuleId) {
                this.egressProxyRuleId = egressProxyRuleId;
                return this;
            }

            /**
             * <p>The priority of the egress proxy rule in the stage to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public PreDns build() {
                return new PreDns(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRuleGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRuleGroupResponseBody</p>
     */
    public static class PreRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EgressProxyRuleId")
        private String egressProxyRuleId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        private PreRequest(Builder builder) {
            this.egressProxyRuleId = builder.egressProxyRuleId;
            this.priority = builder.priority;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreRequest create() {
            return builder().build();
        }

        /**
         * @return egressProxyRuleId
         */
        public String getEgressProxyRuleId() {
            return this.egressProxyRuleId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        public static final class Builder {
            private String egressProxyRuleId; 
            private Integer priority; 

            private Builder() {
            } 

            private Builder(PreRequest model) {
                this.egressProxyRuleId = model.egressProxyRuleId;
                this.priority = model.priority;
            } 

            /**
             * <p>The ID of the egress proxy rule.</p>
             * 
             * <strong>example:</strong>
             * <p>epr-g1w80bb6a91dbb775****</p>
             */
            public Builder egressProxyRuleId(String egressProxyRuleId) {
                this.egressProxyRuleId = egressProxyRuleId;
                return this;
            }

            /**
             * <p>The priority of the egress proxy rule in the stage to which it belongs. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            public PreRequest build() {
                return new PreRequest(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEgressProxyRuleGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateEgressProxyRuleGroupResponseBody</p>
     */
    public static class EgressProxyRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PostResponse")
        private java.util.List<PostResponse> postResponse;

        @com.aliyun.core.annotation.NameInMap("PreDns")
        private java.util.List<PreDns> preDns;

        @com.aliyun.core.annotation.NameInMap("PreRequest")
        private java.util.List<PreRequest> preRequest;

        private EgressProxyRules(Builder builder) {
            this.postResponse = builder.postResponse;
            this.preDns = builder.preDns;
            this.preRequest = builder.preRequest;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressProxyRules create() {
            return builder().build();
        }

        /**
         * @return postResponse
         */
        public java.util.List<PostResponse> getPostResponse() {
            return this.postResponse;
        }

        /**
         * @return preDns
         */
        public java.util.List<PreDns> getPreDns() {
            return this.preDns;
        }

        /**
         * @return preRequest
         */
        public java.util.List<PreRequest> getPreRequest() {
            return this.preRequest;
        }

        public static final class Builder {
            private java.util.List<PostResponse> postResponse; 
            private java.util.List<PreDns> preDns; 
            private java.util.List<PreRequest> preRequest; 

            private Builder() {
            } 

            private Builder(EgressProxyRules model) {
                this.postResponse = model.postResponse;
                this.preDns = model.preDns;
                this.preRequest = model.preRequest;
            } 

            /**
             * <p>The list of rules in the PostResponse stage, which is executed after the response is returned.</p>
             */
            public Builder postResponse(java.util.List<PostResponse> postResponse) {
                this.postResponse = postResponse;
                return this;
            }

            /**
             * <p>The list of rules in the PreDns stage, which is executed before DNS resolution.</p>
             */
            public Builder preDns(java.util.List<PreDns> preDns) {
                this.preDns = preDns;
                return this;
            }

            /**
             * <p>The list of rules in the PreRequest stage, which is executed before the request is forwarded.</p>
             */
            public Builder preRequest(java.util.List<PreRequest> preRequest) {
                this.preRequest = preRequest;
                return this;
            }

            public EgressProxyRules build() {
                return new EgressProxyRules(this);
            } 

        } 

    }
}
