// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link BatchGetStoreTextDataResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetStoreTextDataResponseBody</p>
 */
public class BatchGetStoreTextDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchGetStoreTextDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetStoreTextDataResponseBody create() {
        return builder().build();
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public BatchGetStoreTextDataResponseBody build() {
            return new BatchGetStoreTextDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetStoreTextDataResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetStoreTextDataResponseBody</p>
     */
    public static class ContainerData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bold")
        private Integer bold;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("Mark")
        private String mark;

        @com.aliyun.core.annotation.NameInMap("SubText")
        private String subText;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private ContainerData(Builder builder) {
            this.bold = builder.bold;
            this.color = builder.color;
            this.mark = builder.mark;
            this.subText = builder.subText;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContainerData create() {
            return builder().build();
        }

        /**
         * @return bold
         */
        public Integer getBold() {
            return this.bold;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return mark
         */
        public String getMark() {
            return this.mark;
        }

        /**
         * @return subText
         */
        public String getSubText() {
            return this.subText;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Integer bold; 
            private String color; 
            private String mark; 
            private String subText; 
            private String text; 

            /**
             * Bold.
             */
            public Builder bold(Integer bold) {
                this.bold = bold;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Mark.
             */
            public Builder mark(String mark) {
                this.mark = mark;
                return this;
            }

            /**
             * SubText.
             */
            public Builder subText(String subText) {
                this.subText = subText;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public ContainerData build() {
                return new ContainerData(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetStoreTextDataResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetStoreTextDataResponseBody</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerData")
        private java.util.List<ContainerData> containerData;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Visible")
        private Integer visible;

        private Containers(Builder builder) {
            this.containerData = builder.containerData;
            this.title = builder.title;
            this.type = builder.type;
            this.visible = builder.visible;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Containers create() {
            return builder().build();
        }

        /**
         * @return containerData
         */
        public java.util.List<ContainerData> getContainerData() {
            return this.containerData;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return visible
         */
        public Integer getVisible() {
            return this.visible;
        }

        public static final class Builder {
            private java.util.List<ContainerData> containerData; 
            private String title; 
            private String type; 
            private Integer visible; 

            /**
             * ContainerData.
             */
            public Builder containerData(java.util.List<ContainerData> containerData) {
                this.containerData = containerData;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Visible.
             */
            public Builder visible(Integer visible) {
                this.visible = visible;
                return this;
            }

            public Containers build() {
                return new Containers(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetStoreTextDataResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetStoreTextDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Containers")
        private java.util.List<Containers> containers;

        @com.aliyun.core.annotation.NameInMap("StoreId")
        private String storeId;

        private Data(Builder builder) {
            this.containers = builder.containers;
            this.storeId = builder.storeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return containers
         */
        public java.util.List<Containers> getContainers() {
            return this.containers;
        }

        /**
         * @return storeId
         */
        public String getStoreId() {
            return this.storeId;
        }

        public static final class Builder {
            private java.util.List<Containers> containers; 
            private String storeId; 

            /**
             * Containers.
             */
            public Builder containers(java.util.List<Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * StoreId.
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
