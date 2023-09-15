// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageFixCycleConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageFixCycleConfigRequest</p>
 */
public class ModifyImageFixCycleConfigRequest extends Request {
    @Body
    @NameInMap("ImageFixCycle")
    private Integer imageFixCycle;

    @Body
    @NameInMap("ImageFixSwitch")
    private String imageFixSwitch;

    @Body
    @NameInMap("ImageFixTarget")
    private String imageFixTarget;

    @Body
    @NameInMap("ImageTimeRange")
    private Integer imageTimeRange;

    private ModifyImageFixCycleConfigRequest(Builder builder) {
        super(builder);
        this.imageFixCycle = builder.imageFixCycle;
        this.imageFixSwitch = builder.imageFixSwitch;
        this.imageFixTarget = builder.imageFixTarget;
        this.imageTimeRange = builder.imageTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImageFixCycleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageFixCycle
     */
    public Integer getImageFixCycle() {
        return this.imageFixCycle;
    }

    /**
     * @return imageFixSwitch
     */
    public String getImageFixSwitch() {
        return this.imageFixSwitch;
    }

    /**
     * @return imageFixTarget
     */
    public String getImageFixTarget() {
        return this.imageFixTarget;
    }

    /**
     * @return imageTimeRange
     */
    public Integer getImageTimeRange() {
        return this.imageTimeRange;
    }

    public static final class Builder extends Request.Builder<ModifyImageFixCycleConfigRequest, Builder> {
        private Integer imageFixCycle; 
        private String imageFixSwitch; 
        private String imageFixTarget; 
        private Integer imageTimeRange; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImageFixCycleConfigRequest request) {
            super(request);
            this.imageFixCycle = request.imageFixCycle;
            this.imageFixSwitch = request.imageFixSwitch;
            this.imageFixTarget = request.imageFixTarget;
            this.imageTimeRange = request.imageTimeRange;
        } 

        /**
         * ImageFixCycle.
         */
        public Builder imageFixCycle(Integer imageFixCycle) {
            this.putBodyParameter("ImageFixCycle", imageFixCycle);
            this.imageFixCycle = imageFixCycle;
            return this;
        }

        /**
         * ImageFixSwitch.
         */
        public Builder imageFixSwitch(String imageFixSwitch) {
            this.putBodyParameter("ImageFixSwitch", imageFixSwitch);
            this.imageFixSwitch = imageFixSwitch;
            return this;
        }

        /**
         * ImageFixTarget.
         */
        public Builder imageFixTarget(String imageFixTarget) {
            this.putBodyParameter("ImageFixTarget", imageFixTarget);
            this.imageFixTarget = imageFixTarget;
            return this;
        }

        /**
         * ImageTimeRange.
         */
        public Builder imageTimeRange(Integer imageTimeRange) {
            this.putBodyParameter("ImageTimeRange", imageTimeRange);
            this.imageTimeRange = imageTimeRange;
            return this;
        }

        @Override
        public ModifyImageFixCycleConfigRequest build() {
            return new ModifyImageFixCycleConfigRequest(this);
        } 

    } 

}
