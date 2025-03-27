// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetWafQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>GetWafQuotaResponseBody</p>
 */
public class GetWafQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Quota")
    private Quota quota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetWafQuotaResponseBody(Builder builder) {
        this.quota = builder.quota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Quota quota; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetWafQuotaResponseBody model) {
            this.quota = model.quota;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Returned quota information.</p>
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetWafQuotaResponseBody build() {
            return new GetWafQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetWafQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafQuotaResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.Map<String, QuotaListItemsValue> items;

        @com.aliyun.core.annotation.NameInMap("NumberItemsPerList")
        private WafQuotaInteger numberItemsPerList;

        @com.aliyun.core.annotation.NameInMap("NumberItemsTotal")
        private WafQuotaInteger numberItemsTotal;

        @com.aliyun.core.annotation.NameInMap("NumberTotal")
        private WafQuotaInteger numberTotal;

        private List(Builder builder) {
            this.enable = builder.enable;
            this.items = builder.items;
            this.numberItemsPerList = builder.numberItemsPerList;
            this.numberItemsTotal = builder.numberItemsTotal;
            this.numberTotal = builder.numberTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return items
         */
        public java.util.Map<String, QuotaListItemsValue> getItems() {
            return this.items;
        }

        /**
         * @return numberItemsPerList
         */
        public WafQuotaInteger getNumberItemsPerList() {
            return this.numberItemsPerList;
        }

        /**
         * @return numberItemsTotal
         */
        public WafQuotaInteger getNumberItemsTotal() {
            return this.numberItemsTotal;
        }

        /**
         * @return numberTotal
         */
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

        public static final class Builder {
            private Boolean enable; 
            private java.util.Map<String, QuotaListItemsValue> items; 
            private WafQuotaInteger numberItemsPerList; 
            private WafQuotaInteger numberItemsTotal; 
            private WafQuotaInteger numberTotal; 

            private Builder() {
            } 

            private Builder(List model) {
                this.enable = model.enable;
                this.items = model.items;
                this.numberItemsPerList = model.numberItemsPerList;
                this.numberItemsTotal = model.numberItemsTotal;
                this.numberTotal = model.numberTotal;
            } 

            /**
             * <p>Indicates whether the custom list is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>An object containing quota information for each type of item in the custom list.</p>
             */
            public Builder items(java.util.Map<String, QuotaListItemsValue> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The number quota allowed per custom list.</p>
             */
            public Builder numberItemsPerList(WafQuotaInteger numberItemsPerList) {
                this.numberItemsPerList = numberItemsPerList;
                return this;
            }

            /**
             * <p>The total number quota allowed for items in all custom lists.</p>
             */
            public Builder numberItemsTotal(WafQuotaInteger numberItemsTotal) {
                this.numberItemsTotal = numberItemsTotal;
                return this;
            }

            /**
             * <p>The total number quota allowed for custom lists.</p>
             */
            public Builder numberTotal(WafQuotaInteger numberTotal) {
                this.numberTotal = numberTotal;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafQuotaResponseBody</p>
     */
    public static class ManagedRulesGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("NumberTotal")
        private WafQuotaInteger numberTotal;

        private ManagedRulesGroup(Builder builder) {
            this.enable = builder.enable;
            this.numberTotal = builder.numberTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRulesGroup create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return numberTotal
         */
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

        public static final class Builder {
            private Boolean enable; 
            private WafQuotaInteger numberTotal; 

            private Builder() {
            } 

            private Builder(ManagedRulesGroup model) {
                this.enable = model.enable;
                this.numberTotal = model.numberTotal;
            } 

            /**
             * <p>Indicates whether the WAF managed rules group is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The total number quota allowed for the WAF managed rules group.</p>
             */
            public Builder numberTotal(WafQuotaInteger numberTotal) {
                this.numberTotal = numberTotal;
                return this;
            }

            public ManagedRulesGroup build() {
                return new ManagedRulesGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafQuotaResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentTypes")
        private java.util.Map<String, QuotaPageContentTypesValue> contentTypes;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("NumberTotal")
        private WafQuotaInteger numberTotal;

        private Page(Builder builder) {
            this.contentTypes = builder.contentTypes;
            this.enable = builder.enable;
            this.numberTotal = builder.numberTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return contentTypes
         */
        public java.util.Map<String, QuotaPageContentTypesValue> getContentTypes() {
            return this.contentTypes;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return numberTotal
         */
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

        public static final class Builder {
            private java.util.Map<String, QuotaPageContentTypesValue> contentTypes; 
            private Boolean enable; 
            private WafQuotaInteger numberTotal; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.contentTypes = model.contentTypes;
                this.enable = model.enable;
                this.numberTotal = model.numberTotal;
            } 

            /**
             * <p>An object containing quota information for each Content-Type in custom response pages.</p>
             */
            public Builder contentTypes(java.util.Map<String, QuotaPageContentTypesValue> contentTypes) {
                this.contentTypes = contentTypes;
                return this;
            }

            /**
             * <p>Indicates whether the custom response page is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The total number quota allowed for custom response pages.</p>
             */
            public Builder numberTotal(WafQuotaInteger numberTotal) {
                this.numberTotal = numberTotal;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafQuotaResponseBody</p>
     */
    public static class ScenePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("NumberTotal")
        private WafQuotaInteger numberTotal;

        private ScenePolicy(Builder builder) {
            this.enable = builder.enable;
            this.numberTotal = builder.numberTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScenePolicy create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return numberTotal
         */
        public WafQuotaInteger getNumberTotal() {
            return this.numberTotal;
        }

        public static final class Builder {
            private Boolean enable; 
            private WafQuotaInteger numberTotal; 

            private Builder() {
            } 

            private Builder(ScenePolicy model) {
                this.enable = model.enable;
                this.numberTotal = model.numberTotal;
            } 

            /**
             * <p>Indicates whether the scene protection feature is enabled.</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The total number quota for scene protection rules.</p>
             */
            public Builder numberTotal(WafQuotaInteger numberTotal) {
                this.numberTotal = numberTotal;
                return this;
            }

            public ScenePolicy build() {
                return new ScenePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWafQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>GetWafQuotaResponseBody</p>
     */
    public static class Quota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("ManagedRulesGroup")
        private ManagedRulesGroup managedRulesGroup;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Page page;

        @com.aliyun.core.annotation.NameInMap("ScenePolicy")
        private ScenePolicy scenePolicy;

        private Quota(Builder builder) {
            this.list = builder.list;
            this.managedRulesGroup = builder.managedRulesGroup;
            this.page = builder.page;
            this.scenePolicy = builder.scenePolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quota create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return managedRulesGroup
         */
        public ManagedRulesGroup getManagedRulesGroup() {
            return this.managedRulesGroup;
        }

        /**
         * @return page
         */
        public Page getPage() {
            return this.page;
        }

        /**
         * @return scenePolicy
         */
        public ScenePolicy getScenePolicy() {
            return this.scenePolicy;
        }

        public static final class Builder {
            private List list; 
            private ManagedRulesGroup managedRulesGroup; 
            private Page page; 
            private ScenePolicy scenePolicy; 

            private Builder() {
            } 

            private Builder(Quota model) {
                this.list = model.list;
                this.managedRulesGroup = model.managedRulesGroup;
                this.page = model.page;
                this.scenePolicy = model.scenePolicy;
            } 

            /**
             * <p>Quota information related to custom lists.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Quota information related to the WAF managed rules group.</p>
             */
            public Builder managedRulesGroup(ManagedRulesGroup managedRulesGroup) {
                this.managedRulesGroup = managedRulesGroup;
                return this;
            }

            /**
             * <p>Quota information related to custom response pages.</p>
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * <p>Quota information related to scene protection.</p>
             */
            public Builder scenePolicy(ScenePolicy scenePolicy) {
                this.scenePolicy = scenePolicy;
                return this;
            }

            public Quota build() {
                return new Quota(this);
            } 

        } 

    }
}
