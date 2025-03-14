// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DataImageRegionDistributeMapValue} extends {@link TeaModel}
 *
 * <p>DataImageRegionDistributeMapValue</p>
 */
public class DataImageRegionDistributeMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DistributeStatus")
    private String distributeStatus;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private String progress;

    private DataImageRegionDistributeMapValue(Builder builder) {
        this.distributeStatus = builder.distributeStatus;
        this.progress = builder.progress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataImageRegionDistributeMapValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return distributeStatus
     */
    public String getDistributeStatus() {
        return this.distributeStatus;
    }

    /**
     * @return progress
     */
    public String getProgress() {
        return this.progress;
    }

    public static final class Builder {
        private String distributeStatus; 
        private String progress; 

        private Builder() {
        } 

        private Builder(DataImageRegionDistributeMapValue model) {
            this.distributeStatus = model.distributeStatus;
            this.progress = model.progress;
        } 

        /**
         * <p>The status of the image distribution task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>AVAILABLE: The task is ready.</li>
         * <li>DELETE: The task is deleted.</li>
         * <li>INIT: The task is being initialized.</li>
         * <li>CREATE_FAILED: The task failed to be created.</li>
         * <li>CREATING: The task is being created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder distributeStatus(String distributeStatus) {
            this.distributeStatus = distributeStatus;
            return this;
        }

        /**
         * <p>The distribution progress of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        public Builder progress(String progress) {
            this.progress = progress;
            return this;
        }

        public DataImageRegionDistributeMapValue build() {
            return new DataImageRegionDistributeMapValue(this);
        } 

    } 

}
