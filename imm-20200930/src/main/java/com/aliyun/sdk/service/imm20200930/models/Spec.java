// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Spec} extends {@link TeaModel}
 *
 * <p>Spec</p>
 */
public class Spec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Backbone")
    private CustomParams backbone;

    @com.aliyun.core.annotation.NameInMap("ClassNum")
    private Long classNum;

    @com.aliyun.core.annotation.NameInMap("Head")
    private CustomParams head;

    @com.aliyun.core.annotation.NameInMap("InputChannel")
    private Long inputChannel;

    @com.aliyun.core.annotation.NameInMap("Loss")
    private CustomParams loss;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Neck")
    private CustomParams neck;

    @com.aliyun.core.annotation.NameInMap("NumLandmarks")
    private Long numLandmarks;

    @com.aliyun.core.annotation.NameInMap("PretrainedPath")
    private String pretrainedPath;

    private Spec(Builder builder) {
        this.backbone = builder.backbone;
        this.classNum = builder.classNum;
        this.head = builder.head;
        this.inputChannel = builder.inputChannel;
        this.loss = builder.loss;
        this.name = builder.name;
        this.neck = builder.neck;
        this.numLandmarks = builder.numLandmarks;
        this.pretrainedPath = builder.pretrainedPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Spec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backbone
     */
    public CustomParams getBackbone() {
        return this.backbone;
    }

    /**
     * @return classNum
     */
    public Long getClassNum() {
        return this.classNum;
    }

    /**
     * @return head
     */
    public CustomParams getHead() {
        return this.head;
    }

    /**
     * @return inputChannel
     */
    public Long getInputChannel() {
        return this.inputChannel;
    }

    /**
     * @return loss
     */
    public CustomParams getLoss() {
        return this.loss;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return neck
     */
    public CustomParams getNeck() {
        return this.neck;
    }

    /**
     * @return numLandmarks
     */
    public Long getNumLandmarks() {
        return this.numLandmarks;
    }

    /**
     * @return pretrainedPath
     */
    public String getPretrainedPath() {
        return this.pretrainedPath;
    }

    public static final class Builder {
        private CustomParams backbone; 
        private Long classNum; 
        private CustomParams head; 
        private Long inputChannel; 
        private CustomParams loss; 
        private String name; 
        private CustomParams neck; 
        private Long numLandmarks; 
        private String pretrainedPath; 

        private Builder() {
        } 

        private Builder(Spec model) {
            this.backbone = model.backbone;
            this.classNum = model.classNum;
            this.head = model.head;
            this.inputChannel = model.inputChannel;
            this.loss = model.loss;
            this.name = model.name;
            this.neck = model.neck;
            this.numLandmarks = model.numLandmarks;
            this.pretrainedPath = model.pretrainedPath;
        } 

        /**
         * <p>The custom parameters for model training.</p>
         */
        public Builder backbone(CustomParams backbone) {
            this.backbone = backbone;
            return this;
        }

        /**
         * <p>The number of output classes of the last layer.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder classNum(Long classNum) {
            this.classNum = classNum;
            return this;
        }

        /**
         * <p>The custom parameters for model training.</p>
         */
        public Builder head(CustomParams head) {
            this.head = head;
            return this;
        }

        /**
         * <p>3</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder inputChannel(Long inputChannel) {
            this.inputChannel = inputChannel;
            return this;
        }

        /**
         * <p>The custom parameters for model training.</p>
         */
        public Builder loss(CustomParams loss) {
            this.loss = loss;
            return this;
        }

        /**
         * <p>The name of the model. The available model names vary with the model category.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ClsResNet</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The custom parameters for model training.</p>
         */
        public Builder neck(CustomParams neck) {
            this.neck = neck;
            return this;
        }

        /**
         * <p>The number of face landmarks. This parameter is required for face detection. In most cases, you can set the parameter to 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder numLandmarks(Long numLandmarks) {
            this.numLandmarks = numLandmarks;
            return this;
        }

        /**
         * <p>The path to the pretrained model.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/abc/xxx.json</p>
         */
        public Builder pretrainedPath(String pretrainedPath) {
            this.pretrainedPath = pretrainedPath;
            return this;
        }

        public Spec build() {
            return new Spec(this);
        } 

    } 

}
