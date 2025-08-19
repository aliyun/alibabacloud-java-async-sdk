// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link CompareFacesRequest} extends {@link RequestModel}
 *
 * <p>CompareFacesRequest</p>
 */
public class CompareFacesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceImageType")
    private String sourceImageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceImageValue")
    private String sourceImageValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetImageType")
    private String targetImageType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetImageValue")
    private String targetImageValue;

    private CompareFacesRequest(Builder builder) {
        super(builder);
        this.sourceImageType = builder.sourceImageType;
        this.sourceImageValue = builder.sourceImageValue;
        this.targetImageType = builder.targetImageType;
        this.targetImageValue = builder.targetImageValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareFacesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceImageType
     */
    public String getSourceImageType() {
        return this.sourceImageType;
    }

    /**
     * @return sourceImageValue
     */
    public String getSourceImageValue() {
        return this.sourceImageValue;
    }

    /**
     * @return targetImageType
     */
    public String getTargetImageType() {
        return this.targetImageType;
    }

    /**
     * @return targetImageValue
     */
    public String getTargetImageValue() {
        return this.targetImageValue;
    }

    public static final class Builder extends Request.Builder<CompareFacesRequest, Builder> {
        private String sourceImageType; 
        private String sourceImageValue; 
        private String targetImageType; 
        private String targetImageValue; 

        private Builder() {
            super();
        } 

        private Builder(CompareFacesRequest request) {
            super(request);
            this.sourceImageType = request.sourceImageType;
            this.sourceImageValue = request.sourceImageValue;
            this.targetImageType = request.targetImageType;
            this.targetImageValue = request.targetImageValue;
        } 

        /**
         * <p>Type of Image 1, with values:</p>
         * <ul>
         * <li><strong>FacePic</strong>: User&quot;s face photo</li>
         * <li><strong>IDPic</strong>: Headshot from the user&quot;s second-generation ID card chip (typically obtained and decoded by a second-generation ID card reader)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FacePic</p>
         */
        public Builder sourceImageType(String sourceImageType) {
            this.putBodyParameter("SourceImageType", sourceImageType);
            this.sourceImageType = sourceImageType;
            return this;
        }

        /**
         * <p>Address of Image 1. Please refer to the instructions on uploading image addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
         */
        public Builder sourceImageValue(String sourceImageValue) {
            this.putBodyParameter("SourceImageValue", sourceImageValue);
            this.sourceImageValue = sourceImageValue;
            return this;
        }

        /**
         * <p>Type of Image 2, with values:</p>
         * <ul>
         * <li><strong>FacePic</strong>: User&quot;s face photo</li>
         * <li><strong>IDPic</strong>: Headshot from the user&quot;s second-generation ID card chip (typically obtained and decoded by a second-generation ID card reader)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FacePic</p>
         */
        public Builder targetImageType(String targetImageType) {
            this.putBodyParameter("TargetImageType", targetImageType);
            this.targetImageType = targetImageType;
            return this;
        }

        /**
         * <p>Address of Image 2. Please refer to the instructions on uploading image addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>http%3A%2F%2Fjiangsu.china.com.cn%2Fuploadfile%2F2015%2F0114%2F1421221304095989.jpg</p>
         */
        public Builder targetImageValue(String targetImageValue) {
            this.putBodyParameter("TargetImageValue", targetImageValue);
            this.targetImageValue = targetImageValue;
            return this;
        }

        @Override
        public CompareFacesRequest build() {
            return new CompareFacesRequest(this);
        } 

    } 

}
