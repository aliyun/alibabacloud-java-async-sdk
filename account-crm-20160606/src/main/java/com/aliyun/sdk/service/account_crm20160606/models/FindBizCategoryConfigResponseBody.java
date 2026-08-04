// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link FindBizCategoryConfigResponseBody} extends {@link TeaModel}
 *
 * <p>FindBizCategoryConfigResponseBody</p>
 */
public class FindBizCategoryConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private FindBizCategoryConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindBizCategoryConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(FindBizCategoryConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public FindBizCategoryConfigResponseBody build() {
            return new FindBizCategoryConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link FindBizCategoryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>FindBizCategoryConfigResponseBody</p>
     */
    public static class BizSubCategory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("IsCheck")
        private Boolean isCheck;

        @com.aliyun.core.annotation.NameInMap("MainBiz")
        private Boolean mainBiz;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Other")
        private String other;

        private BizSubCategory(Builder builder) {
            this.code = builder.code;
            this.isCheck = builder.isCheck;
            this.mainBiz = builder.mainBiz;
            this.name = builder.name;
            this.other = builder.other;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizSubCategory create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return isCheck
         */
        public Boolean getIsCheck() {
            return this.isCheck;
        }

        /**
         * @return mainBiz
         */
        public Boolean getMainBiz() {
            return this.mainBiz;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return other
         */
        public String getOther() {
            return this.other;
        }

        public static final class Builder {
            private String code; 
            private Boolean isCheck; 
            private Boolean mainBiz; 
            private String name; 
            private String other; 

            private Builder() {
            } 

            private Builder(BizSubCategory model) {
                this.code = model.code;
                this.isCheck = model.isCheck;
                this.mainBiz = model.mainBiz;
                this.name = model.name;
                this.other = model.other;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * IsCheck.
             */
            public Builder isCheck(Boolean isCheck) {
                this.isCheck = isCheck;
                return this;
            }

            /**
             * MainBiz.
             */
            public Builder mainBiz(Boolean mainBiz) {
                this.mainBiz = mainBiz;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Other.
             */
            public Builder other(String other) {
                this.other = other;
                return this;
            }

            public BizSubCategory build() {
                return new BizSubCategory(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindBizCategoryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>FindBizCategoryConfigResponseBody</p>
     */
    public static class SubConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizSubCategory")
        private java.util.List<BizSubCategory> bizSubCategory;

        private SubConfigs(Builder builder) {
            this.bizSubCategory = builder.bizSubCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubConfigs create() {
            return builder().build();
        }

        /**
         * @return bizSubCategory
         */
        public java.util.List<BizSubCategory> getBizSubCategory() {
            return this.bizSubCategory;
        }

        public static final class Builder {
            private java.util.List<BizSubCategory> bizSubCategory; 

            private Builder() {
            } 

            private Builder(SubConfigs model) {
                this.bizSubCategory = model.bizSubCategory;
            } 

            /**
             * BizSubCategory.
             */
            public Builder bizSubCategory(java.util.List<BizSubCategory> bizSubCategory) {
                this.bizSubCategory = bizSubCategory;
                return this;
            }

            public SubConfigs build() {
                return new SubConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindBizCategoryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>FindBizCategoryConfigResponseBody</p>
     */
    public static class BizCategory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("IsCheck")
        private Boolean isCheck;

        @com.aliyun.core.annotation.NameInMap("MainBiz")
        private Boolean mainBiz;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Other")
        private String other;

        @com.aliyun.core.annotation.NameInMap("SubConfigs")
        private SubConfigs subConfigs;

        private BizCategory(Builder builder) {
            this.code = builder.code;
            this.isCheck = builder.isCheck;
            this.mainBiz = builder.mainBiz;
            this.name = builder.name;
            this.other = builder.other;
            this.subConfigs = builder.subConfigs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizCategory create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return isCheck
         */
        public Boolean getIsCheck() {
            return this.isCheck;
        }

        /**
         * @return mainBiz
         */
        public Boolean getMainBiz() {
            return this.mainBiz;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return other
         */
        public String getOther() {
            return this.other;
        }

        /**
         * @return subConfigs
         */
        public SubConfigs getSubConfigs() {
            return this.subConfigs;
        }

        public static final class Builder {
            private String code; 
            private Boolean isCheck; 
            private Boolean mainBiz; 
            private String name; 
            private String other; 
            private SubConfigs subConfigs; 

            private Builder() {
            } 

            private Builder(BizCategory model) {
                this.code = model.code;
                this.isCheck = model.isCheck;
                this.mainBiz = model.mainBiz;
                this.name = model.name;
                this.other = model.other;
                this.subConfigs = model.subConfigs;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * IsCheck.
             */
            public Builder isCheck(Boolean isCheck) {
                this.isCheck = isCheck;
                return this;
            }

            /**
             * MainBiz.
             */
            public Builder mainBiz(Boolean mainBiz) {
                this.mainBiz = mainBiz;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Other.
             */
            public Builder other(String other) {
                this.other = other;
                return this;
            }

            /**
             * SubConfigs.
             */
            public Builder subConfigs(SubConfigs subConfigs) {
                this.subConfigs = subConfigs;
                return this;
            }

            public BizCategory build() {
                return new BizCategory(this);
            } 

        } 

    }
    /**
     * 
     * {@link FindBizCategoryConfigResponseBody} extends {@link TeaModel}
     *
     * <p>FindBizCategoryConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCategory")
        private java.util.List<BizCategory> bizCategory;

        private Data(Builder builder) {
            this.bizCategory = builder.bizCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizCategory
         */
        public java.util.List<BizCategory> getBizCategory() {
            return this.bizCategory;
        }

        public static final class Builder {
            private java.util.List<BizCategory> bizCategory; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizCategory = model.bizCategory;
            } 

            /**
             * BizCategory.
             */
            public Builder bizCategory(java.util.List<BizCategory> bizCategory) {
                this.bizCategory = bizCategory;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
