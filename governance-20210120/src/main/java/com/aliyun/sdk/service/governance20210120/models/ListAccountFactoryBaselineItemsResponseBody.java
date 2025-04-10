// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link ListAccountFactoryBaselineItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountFactoryBaselineItemsResponseBody</p>
 */
public class ListAccountFactoryBaselineItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaselineItems")
    private java.util.List<BaselineItems> baselineItems;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccountFactoryBaselineItemsResponseBody(Builder builder) {
        this.baselineItems = builder.baselineItems;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountFactoryBaselineItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineItems
     */
    public java.util.List<BaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<BaselineItems> baselineItems; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAccountFactoryBaselineItemsResponseBody model) {
            this.baselineItems = model.baselineItems;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The baseline items.</p>
         */
        public Builder baselineItems(java.util.List<BaselineItems> baselineItems) {
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAACDGQdAEX3m42z3sQ+f3VTK2Xr2DzYbz/SAfc/zJRqod</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B40D73D8-76AC-5D3C-AC63-4FC8AFCE6671</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccountFactoryBaselineItemsResponseBody build() {
            return new ListAccountFactoryBaselineItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccountFactoryBaselineItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountFactoryBaselineItemsResponseBody</p>
     */
    public static class DependsOn extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private DependsOn(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DependsOn create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(DependsOn model) {
                this.name = model.name;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>AccountFactory</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public DependsOn build() {
                return new DependsOn(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAccountFactoryBaselineItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountFactoryBaselineItemsResponseBody</p>
     */
    public static class BaselineItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DependsOn")
        private java.util.List<DependsOn> dependsOn;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BaselineItems(Builder builder) {
            this.dependsOn = builder.dependsOn;
            this.description = builder.description;
            this.name = builder.name;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItems create() {
            return builder().build();
        }

        /**
         * @return dependsOn
         */
        public java.util.List<DependsOn> getDependsOn() {
            return this.dependsOn;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<DependsOn> dependsOn; 
            private String description; 
            private String name; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(BaselineItems model) {
                this.dependsOn = model.dependsOn;
                this.description = model.description;
                this.name = model.name;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The dependency of the baseline item.</p>
             */
            public Builder dependsOn(java.util.List<DependsOn> dependsOn) {
                this.dependsOn = dependsOn;
                return this;
            }

            /**
             * <p>The description of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>Notification.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-BP_ACCOUNT_FACTORY_ACCOUNT_NOTIFICATION</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>AccountFactory</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BaselineItems build() {
                return new BaselineItems(this);
            } 

        } 

    }
}
