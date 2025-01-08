// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ProcessorAssociate} extends {@link TeaModel}
 *
 * <p>ProcessorAssociate</p>
 */
public class ProcessorAssociate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("processorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processorId;

    private ProcessorAssociate(Builder builder) {
        this.processorId = builder.processorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProcessorAssociate create() {
        return builder().build();
    }

    /**
     * @return processorId
     */
    public String getProcessorId() {
        return this.processorId;
    }

    public static final class Builder {
        private String processorId; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingest-processor-1</p>
         */
        public Builder processorId(String processorId) {
            this.processorId = processorId;
            return this;
        }

        public ProcessorAssociate build() {
            return new ProcessorAssociate(this);
        } 

    } 

}
