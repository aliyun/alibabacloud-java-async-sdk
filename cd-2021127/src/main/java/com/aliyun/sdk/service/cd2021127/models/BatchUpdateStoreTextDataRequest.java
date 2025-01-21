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
 * {@link BatchUpdateStoreTextDataRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateStoreTextDataRequest</p>
 */
public class BatchUpdateStoreTextDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreTextData")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<StoreTextData> storeTextData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("country")
    private String country;

    private BatchUpdateStoreTextDataRequest(Builder builder) {
        super(builder);
        this.storeTextData = builder.storeTextData;
        this.country = builder.country;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateStoreTextDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return storeTextData
     */
    public java.util.List<StoreTextData> getStoreTextData() {
        return this.storeTextData;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    public static final class Builder extends Request.Builder<BatchUpdateStoreTextDataRequest, Builder> {
        private java.util.List<StoreTextData> storeTextData; 
        private String country; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateStoreTextDataRequest request) {
            super(request);
            this.storeTextData = request.storeTextData;
            this.country = request.country;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder storeTextData(java.util.List<StoreTextData> storeTextData) {
            String storeTextDataShrink = shrink(storeTextData, "StoreTextData", "json");
            this.putBodyParameter("StoreTextData", storeTextDataShrink);
            this.storeTextData = storeTextData;
            return this;
        }

        /**
         * country.
         */
        public Builder country(String country) {
            this.putBodyParameter("country", country);
            this.country = country;
            return this;
        }

        @Override
        public BatchUpdateStoreTextDataRequest build() {
            return new BatchUpdateStoreTextDataRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchUpdateStoreTextDataRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateStoreTextDataRequest</p>
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
     * {@link BatchUpdateStoreTextDataRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateStoreTextDataRequest</p>
     */
    public static class Containers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainerData")
        private java.util.List<ContainerData> containerData;

        @com.aliyun.core.annotation.NameInMap("Title")
        @com.aliyun.core.annotation.Validation(required = true)
        private String title;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TOP</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TOP</p>
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
     * {@link BatchUpdateStoreTextDataRequest} extends {@link TeaModel}
     *
     * <p>BatchUpdateStoreTextDataRequest</p>
     */
    public static class StoreTextData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Containers")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Containers> containers;

        @com.aliyun.core.annotation.NameInMap("StoreId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String storeId;

        private StoreTextData(Builder builder) {
            this.containers = builder.containers;
            this.storeId = builder.storeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoreTextData create() {
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
             * <p>This parameter is required.</p>
             */
            public Builder containers(java.util.List<Containers> containers) {
                this.containers = containers;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>shopcode</p>
             */
            public Builder storeId(String storeId) {
                this.storeId = storeId;
                return this;
            }

            public StoreTextData build() {
                return new StoreTextData(this);
            } 

        } 

    }
}
