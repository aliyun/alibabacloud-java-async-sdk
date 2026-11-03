// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link ListVoicesRequest} extends {@link RequestModel}
 *
 * <p>ListVoicesRequest</p>
 */
public class ListVoicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsAccessType")
    private String nlsAccessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NlsEngine")
    private String nlsEngine;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OmniModel")
    private Boolean omniModel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListVoicesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.model = builder.model;
        this.nlsAccessType = builder.nlsAccessType;
        this.nlsEngine = builder.nlsEngine;
        this.omniModel = builder.omniModel;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nlsAccessType
     */
    public String getNlsAccessType() {
        return this.nlsAccessType;
    }

    /**
     * @return nlsEngine
     */
    public String getNlsEngine() {
        return this.nlsEngine;
    }

    /**
     * @return omniModel
     */
    public Boolean getOmniModel() {
        return this.omniModel;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListVoicesRequest, Builder> {
        private String instanceId; 
        private String model; 
        private String nlsAccessType; 
        private String nlsEngine; 
        private Boolean omniModel; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListVoicesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.model = request.model;
            this.nlsAccessType = request.nlsAccessType;
            this.nlsEngine = request.nlsEngine;
            this.omniModel = request.omniModel;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e48e45dd-e47a-4744-a063-f08cbebb1c5a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-3.8-omni-flash</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The TTS invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        public Builder nlsAccessType(String nlsAccessType) {
            this.putBodyParameter("NlsAccessType", nlsAccessType);
            this.nlsAccessType = nlsAccessType;
            return this;
        }

        /**
         * <p>The TTS engine.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        public Builder nlsEngine(String nlsEngine) {
            this.putBodyParameter("NlsEngine", nlsEngine);
            this.nlsEngine = nlsEngine;
            return this;
        }

        /**
         * <p>Specifies whether the model is an Omni model.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder omniModel(Boolean omniModel) {
            this.putBodyParameter("OmniModel", omniModel);
            this.omniModel = omniModel;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListVoicesRequest build() {
            return new ListVoicesRequest(this);
        } 

    } 

}
