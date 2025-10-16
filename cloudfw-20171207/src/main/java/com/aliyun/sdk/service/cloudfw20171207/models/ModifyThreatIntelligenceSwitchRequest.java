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
 * {@link ModifyThreatIntelligenceSwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyThreatIntelligenceSwitchRequest</p>
 */
public class ModifyThreatIntelligenceSwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryList")
    private java.util.List<CategoryList> categoryList;

    private ModifyThreatIntelligenceSwitchRequest(Builder builder) {
        super(builder);
        this.categoryList = builder.categoryList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyThreatIntelligenceSwitchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryList
     */
    public java.util.List<CategoryList> getCategoryList() {
        return this.categoryList;
    }

    public static final class Builder extends Request.Builder<ModifyThreatIntelligenceSwitchRequest, Builder> {
        private java.util.List<CategoryList> categoryList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyThreatIntelligenceSwitchRequest request) {
            super(request);
            this.categoryList = request.categoryList;
        } 

        /**
         * CategoryList.
         */
        public Builder categoryList(java.util.List<CategoryList> categoryList) {
            this.putQueryParameter("CategoryList", categoryList);
            this.categoryList = categoryList;
            return this;
        }

        @Override
        public ModifyThreatIntelligenceSwitchRequest build() {
            return new ModifyThreatIntelligenceSwitchRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyThreatIntelligenceSwitchRequest} extends {@link TeaModel}
     *
     * <p>ModifyThreatIntelligenceSwitchRequest</p>
     */
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        private CategoryList(Builder builder) {
            this.action = builder.action;
            this.categoryId = builder.categoryId;
            this.enableStatus = builder.enableStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public static final class Builder {
            private String action; 
            private String categoryId; 
            private String enableStatus; 

            private Builder() {
            } 

            private Builder(CategoryList model) {
                this.action = model.action;
                this.categoryId = model.categoryId;
                this.enableStatus = model.enableStatus;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * EnableStatus.
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
}
