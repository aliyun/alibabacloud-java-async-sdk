// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

        /**
         * Quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>Id of the request</p>
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
        private java.util.Map < String, QuotaListItemsValue > items;

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
        public java.util.Map < String, QuotaListItemsValue > getItems() {
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
            private java.util.Map < String, QuotaListItemsValue > items; 
            private WafQuotaInteger numberItemsPerList; 
            private WafQuotaInteger numberItemsTotal; 
            private WafQuotaInteger numberTotal; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Items.
             */
            public Builder items(java.util.Map < String, QuotaListItemsValue > items) {
                this.items = items;
                return this;
            }

            /**
             * NumberItemsPerList.
             */
            public Builder numberItemsPerList(WafQuotaInteger numberItemsPerList) {
                this.numberItemsPerList = numberItemsPerList;
                return this;
            }

            /**
             * NumberItemsTotal.
             */
            public Builder numberItemsTotal(WafQuotaInteger numberItemsTotal) {
                this.numberItemsTotal = numberItemsTotal;
                return this;
            }

            /**
             * NumberTotal.
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

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * NumberTotal.
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
        private java.util.Map < String, QuotaPageContentTypesValue > contentTypes;

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
        public java.util.Map < String, QuotaPageContentTypesValue > getContentTypes() {
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
            private java.util.Map < String, QuotaPageContentTypesValue > contentTypes; 
            private Boolean enable; 
            private WafQuotaInteger numberTotal; 

            /**
             * ContentTypes.
             */
            public Builder contentTypes(java.util.Map < String, QuotaPageContentTypesValue > contentTypes) {
                this.contentTypes = contentTypes;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * NumberTotal.
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

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * NumberTotal.
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

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * ManagedRulesGroup.
             */
            public Builder managedRulesGroup(ManagedRulesGroup managedRulesGroup) {
                this.managedRulesGroup = managedRulesGroup;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * ScenePolicy.
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
