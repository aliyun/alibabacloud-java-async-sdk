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
 * {@link MeasureList} extends {@link TeaModel}
 *
 * <p>MeasureList</p>
 */
public class MeasureList extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("groupBy")
    private java.util.List<String> groupBy;

    @com.aliyun.core.annotation.NameInMap("measureCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String measureCode;

    @com.aliyun.core.annotation.NameInMap("windowSecs")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer windowSecs;

    private MeasureList(Builder builder) {
        this.groupBy = builder.groupBy;
        this.measureCode = builder.measureCode;
        this.windowSecs = builder.windowSecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MeasureList create() {
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

        private Builder(MeasureList model) {
            this.groupBy = model.groupBy;
            this.measureCode = model.measureCode;
            this.windowSecs = model.windowSecs;
        } 

        /**
         * groupBy.
         */
        public Builder groupBy(java.util.List<String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder measureCode(String measureCode) {
            this.measureCode = measureCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder windowSecs(Integer windowSecs) {
            this.windowSecs = windowSecs;
            return this;
        }

        public MeasureList build() {
            return new MeasureList(this);
        } 

    } 

}
