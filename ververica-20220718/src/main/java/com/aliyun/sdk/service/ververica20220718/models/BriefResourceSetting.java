// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BriefResourceSetting} extends {@link TeaModel}
 *
 * <p>BriefResourceSetting</p>
 */
public class BriefResourceSetting extends TeaModel {
    @NameInMap("batchResourceSetting")
    private BatchResourceSetting batchResourceSetting;

    @NameInMap("flinkConf")
    private java.util.Map < String, ? > flinkConf;

    @NameInMap("streamingResourceSetting")
    private StreamingResourceSetting streamingResourceSetting;

    private BriefResourceSetting(Builder builder) {
        this.batchResourceSetting = builder.batchResourceSetting;
        this.flinkConf = builder.flinkConf;
        this.streamingResourceSetting = builder.streamingResourceSetting;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BriefResourceSetting create() {
        return builder().build();
    }

    /**
     * @return batchResourceSetting
     */
    public BatchResourceSetting getBatchResourceSetting() {
        return this.batchResourceSetting;
    }

    /**
     * @return flinkConf
     */
    public java.util.Map < String, ? > getFlinkConf() {
        return this.flinkConf;
    }

    /**
     * @return streamingResourceSetting
     */
    public StreamingResourceSetting getStreamingResourceSetting() {
        return this.streamingResourceSetting;
    }

    public static final class Builder {
        private BatchResourceSetting batchResourceSetting; 
        private java.util.Map < String, ? > flinkConf; 
        private StreamingResourceSetting streamingResourceSetting; 

        /**
         * batchResourceSetting.
         */
        public Builder batchResourceSetting(BatchResourceSetting batchResourceSetting) {
            this.batchResourceSetting = batchResourceSetting;
            return this;
        }

        /**
         * flinkConf.
         */
        public Builder flinkConf(java.util.Map < String, ? > flinkConf) {
            this.flinkConf = flinkConf;
            return this;
        }

        /**
         * streamingResourceSetting.
         */
        public Builder streamingResourceSetting(StreamingResourceSetting streamingResourceSetting) {
            this.streamingResourceSetting = streamingResourceSetting;
            return this;
        }

        public BriefResourceSetting build() {
            return new BriefResourceSetting(this);
        } 

    } 

}
