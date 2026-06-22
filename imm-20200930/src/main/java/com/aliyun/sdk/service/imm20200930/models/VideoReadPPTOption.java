// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link VideoReadPPTOption} extends {@link TeaModel}
 *
 * <p>VideoReadPPTOption</p>
 */
public class VideoReadPPTOption extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Extract")
    private Boolean extract;

    private VideoReadPPTOption(Builder builder) {
        this.extract = builder.extract;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VideoReadPPTOption create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extract
     */
    public Boolean getExtract() {
        return this.extract;
    }

    public static final class Builder {
        private Boolean extract; 

        private Builder() {
        } 

        private Builder(VideoReadPPTOption model) {
            this.extract = model.extract;
        } 

        /**
         * Extract.
         */
        public Builder extract(Boolean extract) {
            this.extract = extract;
            return this;
        }

        public VideoReadPPTOption build() {
            return new VideoReadPPTOption(this);
        } 

    } 

}
