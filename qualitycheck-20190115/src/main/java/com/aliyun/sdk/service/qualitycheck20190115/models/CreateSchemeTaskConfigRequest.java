// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link CreateSchemeTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateSchemeTaskConfigRequest</p>
 */
public class CreateSchemeTaskConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("jsonStr")
    private String jsonStr;

    private CreateSchemeTaskConfigRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.jsonStr = builder.jsonStr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSchemeTaskConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseMeAgentId
     */
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    /**
     * @return jsonStr
     */
    public String getJsonStr() {
        return this.jsonStr;
    }

    public static final class Builder extends Request.Builder<CreateSchemeTaskConfigRequest, Builder> {
        private Long baseMeAgentId; 
        private String jsonStr; 

        private Builder() {
            super();
        } 

        private Builder(CreateSchemeTaskConfigRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.jsonStr = request.jsonStr;
        } 

        /**
         * <p>baseMeAgentId</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>Input parameter in JSON format. For details, see Request Parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;manualReview&quot;:0,&quot;name&quot;:&quot;检测任务 2022-09-21 16:59:50&quot;,&quot;asrTaskPriority&quot;:2,&quot;modeCustomizationId&quot;:&quot;englishxxx&quot;,&quot;vocabId&quot;:&quot;xxxx5b98d98f8405xxxxxe5dbb383ca1df&quot;,&quot;dataConfig&quot;:{&quot;assignConfigs&quot;:[{&quot;assignConfigContests&quot;:[{&quot;name&quot;:&quot;fileName&quot;,&quot;symbol&quot;:1,&quot;value&quot;:[&quot;1&quot;],&quot;dataType&quot;:2}]}]},&quot;schemeIdList&quot;:[187],&quot;sourceDataType&quot;:1}</p>
         */
        public Builder jsonStr(String jsonStr) {
            this.putQueryParameter("jsonStr", jsonStr);
            this.jsonStr = jsonStr;
            return this;
        }

        @Override
        public CreateSchemeTaskConfigRequest build() {
            return new CreateSchemeTaskConfigRequest(this);
        } 

    } 

}
