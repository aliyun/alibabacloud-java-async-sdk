// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetFormListInAppResponseBody} extends {@link TeaModel}
 *
 * <p>GetFormListInAppResponseBody</p>
 */
public class GetFormListInAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetFormListInAppResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFormListInAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetFormListInAppResponseBody model) {
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
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

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetFormListInAppResponseBody build() {
            return new GetFormListInAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFormListInAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetFormListInAppResponseBody</p>
     */
    public static class Title extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnUS")
        private String enUS;

        @com.aliyun.core.annotation.NameInMap("ZhCN")
        private String zhCN;

        private Title(Builder builder) {
            this.enUS = builder.enUS;
            this.zhCN = builder.zhCN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Title create() {
            return builder().build();
        }

        /**
         * @return enUS
         */
        public String getEnUS() {
            return this.enUS;
        }

        /**
         * @return zhCN
         */
        public String getZhCN() {
            return this.zhCN;
        }

        public static final class Builder {
            private String enUS; 
            private String zhCN; 

            private Builder() {
            } 

            private Builder(Title model) {
                this.enUS = model.enUS;
                this.zhCN = model.zhCN;
            } 

            /**
             * EnUS.
             */
            public Builder enUS(String enUS) {
                this.enUS = enUS;
                return this;
            }

            /**
             * ZhCN.
             */
            public Builder zhCN(String zhCN) {
                this.zhCN = zhCN;
                return this;
            }

            public Title build() {
                return new Title(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFormListInAppResponseBody} extends {@link TeaModel}
     *
     * <p>GetFormListInAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("FormType")
        private String formType;

        @com.aliyun.core.annotation.NameInMap("FormUuid")
        private String formUuid;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Title")
        private Title title;

        private Data(Builder builder) {
            this.creator = builder.creator;
            this.formType = builder.formType;
            this.formUuid = builder.formUuid;
            this.gmtCreate = builder.gmtCreate;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return formType
         */
        public String getFormType() {
            return this.formType;
        }

        /**
         * @return formUuid
         */
        public String getFormUuid() {
            return this.formUuid;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return title
         */
        public Title getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String creator; 
            private String formType; 
            private String formUuid; 
            private String gmtCreate; 
            private Title title; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.creator = model.creator;
                this.formType = model.formType;
                this.formUuid = model.formUuid;
                this.gmtCreate = model.gmtCreate;
                this.title = model.title;
            } 

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * FormType.
             */
            public Builder formType(String formType) {
                this.formType = formType;
                return this;
            }

            /**
             * FormUuid.
             */
            public Builder formUuid(String formUuid) {
                this.formUuid = formUuid;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(Title title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
