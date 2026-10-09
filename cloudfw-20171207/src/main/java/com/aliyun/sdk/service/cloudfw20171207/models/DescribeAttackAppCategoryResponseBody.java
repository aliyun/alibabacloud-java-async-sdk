// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAttackAppCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttackAppCategoryResponseBody</p>
 */
public class DescribeAttackAppCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppCategories")
    private java.util.List<AppCategories> appCategories;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAttackAppCategoryResponseBody(Builder builder) {
        this.appCategories = builder.appCategories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttackAppCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCategories
     */
    public java.util.List<AppCategories> getAppCategories() {
        return this.appCategories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AppCategories> appCategories; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAttackAppCategoryResponseBody model) {
            this.appCategories = model.appCategories;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of attack application categories.</p>
         */
        public Builder appCategories(java.util.List<AppCategories> appCategories) {
            this.appCategories = appCategories;
            return this;
        }

        /**
         * <p>The request ID of the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>B14757D0-4640-4B44-AC67-7F558FE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAttackAppCategoryResponseBody build() {
            return new DescribeAttackAppCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAttackAppCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAttackAppCategoryResponseBody</p>
     */
    public static class AppCategories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttackApps")
        private java.util.List<String> attackApps;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        private AppCategories(Builder builder) {
            this.attackApps = builder.attackApps;
            this.categoryName = builder.categoryName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppCategories create() {
            return builder().build();
        }

        /**
         * @return attackApps
         */
        public java.util.List<String> getAttackApps() {
            return this.attackApps;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        public static final class Builder {
            private java.util.List<String> attackApps; 
            private String categoryName; 

            private Builder() {
            } 

            private Builder(AppCategories model) {
                this.attackApps = model.attackApps;
                this.categoryName = model.categoryName;
            } 

            /**
             * <p>The list of attack applications.</p>
             */
            public Builder attackApps(java.util.List<String> attackApps) {
                this.attackApps = attackApps;
                return this;
            }

            /**
             * <p>The name of the attack application category.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            public AppCategories build() {
                return new AppCategories(this);
            } 

        } 

    }
}
