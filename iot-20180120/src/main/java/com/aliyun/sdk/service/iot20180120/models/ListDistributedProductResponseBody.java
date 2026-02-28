// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListDistributedProductResponseBody} extends {@link TeaModel}
 *
 * <p>ListDistributedProductResponseBody</p>
 */
public class ListDistributedProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDistributedProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDistributedProductResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDistributedProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The products returned if the call is successful. For more information, see the &quot;<strong>Info</strong>&quot; section of this topic.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDistributedProductResponseBody build() {
            return new ListDistributedProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDistributedProductResponseBody} extends {@link TeaModel}
     *
     * <p>ListDistributedProductResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceName")
        private String sourceInstanceName;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("SourceUid")
        private String sourceUid;

        @com.aliyun.core.annotation.NameInMap("TargetAliyunId")
        private String targetAliyunId;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceId")
        private String targetInstanceId;

        @com.aliyun.core.annotation.NameInMap("TargetInstanceName")
        private String targetInstanceName;

        @com.aliyun.core.annotation.NameInMap("TargetRegion")
        private String targetRegion;

        @com.aliyun.core.annotation.NameInMap("TargetUid")
        private String targetUid;

        private Items(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.productKey = builder.productKey;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceName = builder.sourceInstanceName;
            this.sourceRegion = builder.sourceRegion;
            this.sourceUid = builder.sourceUid;
            this.targetAliyunId = builder.targetAliyunId;
            this.targetInstanceId = builder.targetInstanceId;
            this.targetInstanceName = builder.targetInstanceName;
            this.targetRegion = builder.targetRegion;
            this.targetUid = builder.targetUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceInstanceName
         */
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return sourceUid
         */
        public String getSourceUid() {
            return this.sourceUid;
        }

        /**
         * @return targetAliyunId
         */
        public String getTargetAliyunId() {
            return this.targetAliyunId;
        }

        /**
         * @return targetInstanceId
         */
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        /**
         * @return targetInstanceName
         */
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        /**
         * @return targetRegion
         */
        public String getTargetRegion() {
            return this.targetRegion;
        }

        /**
         * @return targetUid
         */
        public String getTargetUid() {
            return this.targetUid;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private String productKey; 
            private String sourceInstanceId; 
            private String sourceInstanceName; 
            private String sourceRegion; 
            private String sourceUid; 
            private String targetAliyunId; 
            private String targetInstanceId; 
            private String targetInstanceName; 
            private String targetRegion; 
            private String targetUid; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.gmtCreate = model.gmtCreate;
                this.productKey = model.productKey;
                this.sourceInstanceId = model.sourceInstanceId;
                this.sourceInstanceName = model.sourceInstanceName;
                this.sourceRegion = model.sourceRegion;
                this.sourceUid = model.sourceUid;
                this.targetAliyunId = model.targetAliyunId;
                this.targetInstanceId = model.targetInstanceId;
                this.targetInstanceName = model.targetInstanceName;
                this.targetRegion = model.targetRegion;
                this.targetUid = model.targetUid;
            } 

            /**
             * <p>The time when the distribution task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1581595942</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The <strong>ProductKey</strong> of the product.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * <p>The ID of the source instance to which the product belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>iot-cn-6ja***</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * <p>The name of the source instance to which the product belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>myproInstance</p>
             */
            public Builder sourceInstanceName(String sourceInstanceName) {
                this.sourceInstanceName = sourceInstanceName;
                return this;
            }

            /**
             * <p>The source region to which the product belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to distribute the product. You can distribute products across regions and instances only within the same Alibaba cloud account. The value of this parameter is the same as the value of the <strong>TargetUid</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>198***</p>
             */
            public Builder sourceUid(String sourceUid) {
                this.sourceUid = sourceUid;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account to which the product is distributed.</p>
             * 
             * <strong>example:</strong>
             * <p>io****@example.com</p>
             */
            public Builder targetAliyunId(String targetAliyunId) {
                this.targetAliyunId = targetAliyunId;
                return this;
            }

            /**
             * <p>The ID of the destination instance to which the product is distributed.</p>
             * 
             * <strong>example:</strong>
             * <p>iot-cn-09k***</p>
             */
            public Builder targetInstanceId(String targetInstanceId) {
                this.targetInstanceId = targetInstanceId;
                return this;
            }

            /**
             * <p>The name of the destination instance to which the product is distributed.</p>
             * 
             * <strong>example:</strong>
             * <p>newinstance</p>
             */
            public Builder targetInstanceName(String targetInstanceName) {
                this.targetInstanceName = targetInstanceName;
                return this;
            }

            /**
             * <p>The destination region to which the product is distributed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder targetRegion(String targetRegion) {
                this.targetRegion = targetRegion;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the product is distributed.</p>
             * <p>You can distribute devices across regions and instances only within the same Alibaba cloud account. The value of this parameter is the same as the value of the <strong>TargetUid</strong> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>198***</p>
             */
            public Builder targetUid(String targetUid) {
                this.targetUid = targetUid;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDistributedProductResponseBody} extends {@link TeaModel}
     *
     * <p>ListDistributedProductResponseBody</p>
     */
    public static class Info extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        private Info(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Info create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(Info model) {
                this.items = model.items;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public Info build() {
                return new Info(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDistributedProductResponseBody} extends {@link TeaModel}
     *
     * <p>ListDistributedProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private Info info;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.info = builder.info;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public Info getInfo() {
            return this.info;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Info info; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.info = model.info;
                this.total = model.total;
            } 

            /**
             * <p>The information about the product.</p>
             */
            public Builder info(Info info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The total number of returned products.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
