// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

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
 * {@link RectVerticalRequest} extends {@link RequestModel}
 *
 * <p>RectVerticalRequest</p>
 */
public class RectVerticalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountDetectDoor")
    private Integer countDetectDoor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetectDoor")
    private Boolean detectDoor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subSceneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerticalRect")
    @com.aliyun.core.annotation.Validation(required = true)
    private String verticalRect;

    private RectVerticalRequest(Builder builder) {
        super(builder);
        this.countDetectDoor = builder.countDetectDoor;
        this.detectDoor = builder.detectDoor;
        this.subSceneId = builder.subSceneId;
        this.verticalRect = builder.verticalRect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RectVerticalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return countDetectDoor
     */
    public Integer getCountDetectDoor() {
        return this.countDetectDoor;
    }

    /**
     * @return detectDoor
     */
    public Boolean getDetectDoor() {
        return this.detectDoor;
    }

    /**
     * @return subSceneId
     */
    public String getSubSceneId() {
        return this.subSceneId;
    }

    /**
     * @return verticalRect
     */
    public String getVerticalRect() {
        return this.verticalRect;
    }

    public static final class Builder extends Request.Builder<RectVerticalRequest, Builder> {
        private Integer countDetectDoor; 
        private Boolean detectDoor; 
        private String subSceneId; 
        private String verticalRect; 

        private Builder() {
            super();
        } 

        private Builder(RectVerticalRequest request) {
            super(request);
            this.countDetectDoor = request.countDetectDoor;
            this.detectDoor = request.detectDoor;
            this.subSceneId = request.subSceneId;
            this.verticalRect = request.verticalRect;
        } 

        /**
         * CountDetectDoor.
         */
        public Builder countDetectDoor(Integer countDetectDoor) {
            this.putQueryParameter("CountDetectDoor", countDetectDoor);
            this.countDetectDoor = countDetectDoor;
            return this;
        }

        /**
         * DetectDoor.
         */
        public Builder detectDoor(Boolean detectDoor) {
            this.putQueryParameter("DetectDoor", detectDoor);
            this.detectDoor = detectDoor;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234****</p>
         */
        public Builder subSceneId(String subSceneId) {
            this.putQueryParameter("SubSceneId", subSceneId);
            this.subSceneId = subSceneId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;844946777965268992&quot;:[[0.42418407210144654,0.33625107620738004,0.42620819117478337,0.635753199572695],[0.5158627587152769,0.3071978991900134,0.5177513758740194,0.6312118011104786],[0.582693212445534,0.3733969265933281,0.5807612760319687,0.6139402811250833]]}</p>
         */
        public Builder verticalRect(String verticalRect) {
            this.putQueryParameter("VerticalRect", verticalRect);
            this.verticalRect = verticalRect;
            return this;
        }

        @Override
        public RectVerticalRequest build() {
            return new RectVerticalRequest(this);
        } 

    } 

}
