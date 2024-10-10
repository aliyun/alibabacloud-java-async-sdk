// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyImageFixCycleConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyImageFixCycleConfigRequest</p>
 */
public class ModifyImageFixCycleConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageFixCycle")
    private Integer imageFixCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageFixSwitch")
    private String imageFixSwitch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageFixTarget")
    private String imageFixTarget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageTimeRange")
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
         * <p>The cycle of the scheduled fix. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder imageFixCycle(Integer imageFixCycle) {
            this.putBodyParameter("ImageFixCycle", imageFixCycle);
            this.imageFixCycle = imageFixCycle;
            return this;
        }

        /**
         * <p>Specifies whether to enable the schedule image fix.</p>
         * <ul>
         * <li><strong>on</strong>: enable</li>
         * <li><strong>off</strong>: disable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder imageFixSwitch(String imageFixSwitch) {
            this.putBodyParameter("ImageFixSwitch", imageFixSwitch);
            this.imageFixSwitch = imageFixSwitch;
            return this;
        }

        /**
         * <p>The range of the scheduled fix. The value of this parameter is in the JSON format and contains the following fields:</p>
         * <ul>
         * <li><strong>type</strong>: The type of the image. The value is fixed to repo.</li>
         * <li><strong>target</strong>: The content of the image. The value is in the format of Namespace/Image repository.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;repo&quot;,&quot;target&quot;:[&quot;cdp-uat/zentao&quot;,&quot;qa-dac/yyuan9&quot;,&quot;cafdms-qa/xxl-job-admin&quot;]}</p>
         */
        public Builder imageFixTarget(String imageFixTarget) {
            this.putBodyParameter("ImageFixTarget", imageFixTarget);
            this.imageFixTarget = imageFixTarget;
            return this;
        }

        /**
         * <p>The time range during which the image was modified. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
