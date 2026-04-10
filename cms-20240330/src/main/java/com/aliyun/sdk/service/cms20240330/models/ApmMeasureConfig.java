// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ApmMeasureConfig} extends {@link TeaModel}
 *
 * <p>ApmMeasureConfig</p>
 */
public class ApmMeasureConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.List<String> groupBy;

    @com.aliyun.core.annotation.NameInMap("measureCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String measureCode;

    @com.aliyun.core.annotation.NameInMap("windowSecs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer windowSecs;

    private ApmMeasureConfig(Builder builder) {
        this.groupBy = builder.groupBy;
        this.measureCode = builder.measureCode;
        this.windowSecs = builder.windowSecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApmMeasureConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupBy
     */
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    /**
     * @return measureCode
     */
    public String getMeasureCode() {
        return this.measureCode;
    }

    /**
     * @return windowSecs
     */
    public Integer getWindowSecs() {
        return this.windowSecs;
    }

    public static final class Builder {
        private java.util.List<String> groupBy; 
        private String measureCode; 
        private Integer windowSecs; 

        private Builder() {
        } 

        private Builder(ApmMeasureConfig model) {
            this.groupBy = model.groupBy;
            this.measureCode = model.measureCode;
            this.windowSecs = model.windowSecs;
        } 

        /**
         * <p>分组维度</p>
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>指标代码</p>
         * <p>This parameter is required.</p>
         */
        public Builder measureCode(String measureCode) {
            this.measureCode = measureCode;
            return this;
        }

        /**
         * <p>查询时间窗口（秒）</p>
         * <p>This parameter is required.</p>
         */
        public Builder windowSecs(Integer windowSecs) {
            this.windowSecs = windowSecs;
            return this;
        }

        public ApmMeasureConfig build() {
            return new ApmMeasureConfig(this);
        } 

    } 

}
