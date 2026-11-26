// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLJobCheckpointConfig} extends {@link TeaModel}
 *
 * <p>RLJobCheckpointConfig</p>
 */
public class RLJobCheckpointConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.NameInMap("SaveIntervalSteps")
    private Integer saveIntervalSteps;

    private RLJobCheckpointConfig(Builder builder) {
        this.path = builder.path;
        this.saveIntervalSteps = builder.saveIntervalSteps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobCheckpointConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return saveIntervalSteps
     */
    public Integer getSaveIntervalSteps() {
        return this.saveIntervalSteps;
    }

    public static final class Builder {
        private String path; 
        private Integer saveIntervalSteps; 

        private Builder() {
        } 

        private Builder(RLJobCheckpointConfig model) {
            this.path = model.path;
            this.saveIntervalSteps = model.saveIntervalSteps;
        } 

        /**
         * <p>工作容器内的绝对路径，必须位于可读写的数据源挂载目录内。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/output</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>Checkpoint 保存间隔。-1 表示关闭，正整数表示每 N 个训练步保存</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder saveIntervalSteps(Integer saveIntervalSteps) {
            this.saveIntervalSteps = saveIntervalSteps;
            return this;
        }

        public RLJobCheckpointConfig build() {
            return new RLJobCheckpointConfig(this);
        } 

    } 

}
