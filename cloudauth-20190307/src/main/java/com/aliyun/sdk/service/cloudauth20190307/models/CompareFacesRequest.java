// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompareFacesRequest} extends {@link RequestModel}
 *
 * <p>CompareFacesRequest</p>
 */
public class CompareFacesRequest extends Request {
    @Body
    @NameInMap("SourceImageType")
    private String sourceImageType;

    @Body
    @NameInMap("SourceImageValue")
    private String sourceImageValue;

    @Body
    @NameInMap("TargetImageType")
    private String targetImageType;

    @Body
    @NameInMap("TargetImageValue")
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
         * SourceImageType.
         */
        public Builder sourceImageType(String sourceImageType) {
            this.putBodyParameter("SourceImageType", sourceImageType);
            this.sourceImageType = sourceImageType;
            return this;
        }

        /**
         * SourceImageValue.
         */
        public Builder sourceImageValue(String sourceImageValue) {
            this.putBodyParameter("SourceImageValue", sourceImageValue);
            this.sourceImageValue = sourceImageValue;
            return this;
        }

        /**
         * TargetImageType.
         */
        public Builder targetImageType(String targetImageType) {
            this.putBodyParameter("TargetImageType", targetImageType);
            this.targetImageType = targetImageType;
            return this;
        }

        /**
         * TargetImageValue.
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
