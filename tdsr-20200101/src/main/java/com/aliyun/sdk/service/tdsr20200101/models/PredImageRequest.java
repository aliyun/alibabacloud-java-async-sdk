// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredImageRequest} extends {@link RequestModel}
 *
 * <p>PredImageRequest</p>
 */
public class PredImageRequest extends Request {
    @Query
    @NameInMap("CorrectVertical")
    @Validation(required = true)
    private Boolean correctVertical;

    @Query
    @NameInMap("CountDetectDoor")
    private Long countDetectDoor;

    @Query
    @NameInMap("DetectDoor")
    @Validation(required = true)
    private Boolean detectDoor;

    @Query
    @NameInMap("SubSceneId")
    @Validation(required = true, minimum = 1)
    private String subSceneId;

    private PredImageRequest(Builder builder) {
        super(builder);
        this.correctVertical = builder.correctVertical;
        this.countDetectDoor = builder.countDetectDoor;
        this.detectDoor = builder.detectDoor;
        this.subSceneId = builder.subSceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return correctVertical
     */
    public Boolean getCorrectVertical() {
        return this.correctVertical;
    }

    /**
     * @return countDetectDoor
     */
    public Long getCountDetectDoor() {
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

    public static final class Builder extends Request.Builder<PredImageRequest, Builder> {
        private Boolean correctVertical; 
        private Long countDetectDoor; 
        private Boolean detectDoor; 
        private String subSceneId; 

        private Builder() {
            super();
        } 

        private Builder(PredImageRequest request) {
            super(request);
            this.correctVertical = request.correctVertical;
            this.countDetectDoor = request.countDetectDoor;
            this.detectDoor = request.detectDoor;
            this.subSceneId = request.subSceneId;
        } 

        /**
         * 是否垂直矫正
         */
        public Builder correctVertical(Boolean correctVertical) {
            this.putQueryParameter("CorrectVertical", correctVertical);
            this.correctVertical = correctVertical;
            return this;
        }

        /**
         * 门数量(DetectDoor为false时，可为0)
         */
        public Builder countDetectDoor(Long countDetectDoor) {
            this.putQueryParameter("CountDetectDoor", countDetectDoor);
            this.countDetectDoor = countDetectDoor;
            return this;
        }

        /**
         * 是否门预测
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

        @Override
        public PredImageRequest build() {
            return new PredImageRequest(this);
        } 

    } 

}
