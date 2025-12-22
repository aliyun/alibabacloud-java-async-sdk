// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ModifySecondRankResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySecondRankResponseBody</p>
 */
public class ModifySecondRankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private ModifySecondRankResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecondRankResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ModifySecondRankResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C5E2F73C-8241-81F8-3A62-65478C5A3111</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the fine sort expression.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ModifySecondRankResponseBody build() {
            return new ModifySecondRankResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifySecondRankResponseBody} extends {@link TeaModel}
     *
     * <p>ModifySecondRankResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("isDefault")
        private String isDefault;

        @com.aliyun.core.annotation.NameInMap("isSys")
        private String isSys;

        @com.aliyun.core.annotation.NameInMap("meta")
        private String meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.active = builder.active;
            this.created = builder.created;
            this.description = builder.description;
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.isSys = builder.isSys;
            this.meta = builder.meta;
            this.name = builder.name;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return isSys
         */
        public String getIsSys() {
            return this.isSys;
        }

        /**
         * @return meta
         */
        public String getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean active; 
            private Integer created; 
            private String description; 
            private String id; 
            private String isDefault; 
            private String isSys; 
            private String meta; 
            private String name; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.active = model.active;
                this.created = model.created;
                this.description = model.description;
                this.id = model.id;
                this.isDefault = model.isDefault;
                this.isSys = model.isSys;
                this.meta = model.meta;
                this.name = model.name;
                this.updated = model.updated;
            } 

            /**
             * <p>Indicates whether the expression is the default one.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The time when the expression was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The description of the expression.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;11&quot;</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The expression ID. This parameter is displayed only in the response.</p>
             * 
             * <strong>example:</strong>
             * <p>890473</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the expression is the default one. This parameter is displayed only in the response. Valid values:</p>
             * <ul>
             * <li>true: the expression is the default one.</li>
             * <li>false: the expression is not the default one.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>Indicates whether the expression is a system expression. This parameter is displayed only in the response. Valid values:</p>
             * <ul>
             * <li>true: The expression is a system expression.</li>
             * <li>false:The expression is not a system expression</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isSys(String isSys) {
                this.isSys = isSys;
                return this;
            }

            /**
             * <p>The content of the fine sort expression. You can define an expression that consists of fields, feature functions, and mathematical functions to implement complex sort logic.</p>
             * 
             * <strong>example:</strong>
             * <p>cate_id &gt; 0 and cate_id &lt; 1000</p>
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The expression name.</p>
             * 
             * <strong>example:</strong>
             * <p>lsh_second_1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the expression was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
