// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RectVerticalRequest} extends {@link RequestModel}
 *
 * <p>RectVerticalRequest</p>
 */
public class RectVerticalRequest extends Request {
    @Query
    @NameInMap("CountDetectDoor")
    private Integer countDetectDoor;

    @Query
    @NameInMap("DetectDoor")
    private Boolean detectDoor;

    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true)
    private String subSceneId;

    @Query
    @NameInMap("VerticalRect")
    @Validation(required = true)
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

        private Builder(RectVerticalRequest response) {
            super(response);
            this.countDetectDoor = response.countDetectDoor;
            this.detectDoor = response.detectDoor;
            this.subSceneId = response.subSceneId;
            this.verticalRect = response.verticalRect;
        } 

        /**
         * 需要预测的门的数量
         */
        public Builder countDetectDoor(Integer countDetectDoor) {
            this.putQueryParameter("CountDetectDoor", countDetectDoor);
            this.countDetectDoor = countDetectDoor;
            return this;
        }

        /**
         * 是否开启门预测
         */
        public Builder detectDoor(Boolean detectDoor) {
            this.putQueryParameter("DetectDoor", detectDoor);
            this.detectDoor = detectDoor;
            return this;
        }

        /**
         * 子场景ID
         */
        public Builder subSceneId(String subSceneId) {
            this.putQueryParameter("SubSceneId", subSceneId);
            this.subSceneId = subSceneId;
            return this;
        }

        /**
         * 矫正数据
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
