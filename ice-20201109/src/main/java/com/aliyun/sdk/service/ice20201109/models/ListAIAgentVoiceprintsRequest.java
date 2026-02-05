// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListAIAgentVoiceprintsRequest} extends {@link RequestModel}
 *
 * <p>ListAIAgentVoiceprintsRequest</p>
 */
public class ListAIAgentVoiceprintsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrationMode")
    private String registrationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceprintId")
    private String voiceprintId;

    private ListAIAgentVoiceprintsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.registrationMode = builder.registrationMode;
        this.voiceprintId = builder.voiceprintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIAgentVoiceprintsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return registrationMode
     */
    public String getRegistrationMode() {
        return this.registrationMode;
    }

    /**
     * @return voiceprintId
     */
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

    public static final class Builder extends Request.Builder<ListAIAgentVoiceprintsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String registrationMode; 
        private String voiceprintId; 

        private Builder() {
            super();
        } 

        private Builder(ListAIAgentVoiceprintsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.registrationMode = request.registrationMode;
            this.voiceprintId = request.voiceprintId;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Value values: [1,100].</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegistrationMode.
         */
        public Builder registrationMode(String registrationMode) {
            this.putQueryParameter("RegistrationMode", registrationMode);
            this.registrationMode = registrationMode;
            return this;
        }

        /**
         * <p>A unique identifier for the voiceprint. This parameter is optional. If provided, only the information for that ID is returned. If not specified, all voiceprints under the account are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>vp_1699123456_8527</p>
         */
        public Builder voiceprintId(String voiceprintId) {
            this.putQueryParameter("VoiceprintId", voiceprintId);
            this.voiceprintId = voiceprintId;
            return this;
        }

        @Override
        public ListAIAgentVoiceprintsRequest build() {
            return new ListAIAgentVoiceprintsRequest(this);
        } 

    } 

}
