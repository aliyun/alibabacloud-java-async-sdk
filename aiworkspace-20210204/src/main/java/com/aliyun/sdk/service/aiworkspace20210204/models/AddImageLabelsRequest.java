// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link AddImageLabelsRequest} extends {@link RequestModel}
 *
 * <p>AddImageLabelsRequest</p>
 */
public class AddImageLabelsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Labels> labels;

    private AddImageLabelsRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddImageLabelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<AddImageLabelsRequest, Builder> {
        private String imageId; 
        private java.util.List<Labels> labels; 

        private Builder() {
            super();
        } 

        private Builder(AddImageLabelsRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.labels = request.labels;
        } 

        /**
         * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image-4c62******53uor</p>
         */
        public Builder imageId(String imageId) {
            this.putPathParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The list of image tags.</p>
         * <p>This parameter is required.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public AddImageLabelsRequest build() {
            return new AddImageLabelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddImageLabelsRequest} extends {@link TeaModel}
     *
     * <p>AddImageLabelsRequest</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The following keys can be added:</p>
             * <ul>
             * <li>system.chipType</li>
             * <li>system.dsw.cudaVersion</li>
             * <li>system.dsw.fromImageId</li>
             * <li>system.dsw.fromInstanceId</li>
             * <li>system.dsw.id</li>
             * <li>system.dsw.os</li>
             * <li>system.dsw.osVersion</li>
             * <li>system.dsw.resourceType</li>
             * <li>system.dsw.rootImageId</li>
             * <li>system.dsw.stage</li>
             * <li>system.dsw.tag</li>
             * <li>system.dsw.type</li>
             * <li>system.framework</li>
             * <li>system.origin</li>
             * <li>system.pythonVersion</li>
             * <li>system.source</li>
             * <li>system.supported.dlc</li>
             * <li>system.supported.dsw</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system.chipType</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>GPU</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
