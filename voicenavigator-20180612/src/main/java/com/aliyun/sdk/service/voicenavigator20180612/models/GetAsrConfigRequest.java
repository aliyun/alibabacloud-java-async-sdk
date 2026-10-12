// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link GetAsrConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAsrConfigRequest</p>
 */
public class GetAsrConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigLevel")
    private Integer configLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryId")
    private String entryId;

    private GetAsrConfigRequest(Builder builder) {
        super(builder);
        this.configLevel = builder.configLevel;
        this.entryId = builder.entryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsrConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configLevel
     */
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    /**
     * @return entryId
     */
    public String getEntryId() {
        return this.entryId;
    }

    public static final class Builder extends Request.Builder<GetAsrConfigRequest, Builder> {
        private Integer configLevel; 
        private String entryId; 

        private Builder() {
            super();
        } 

        private Builder(GetAsrConfigRequest request) {
            super(request);
            this.configLevel = request.configLevel;
            this.entryId = request.entryId;
        } 

        /**
         * <p>The policy level. Valid values:</p>
         * <ul>
         * <li>0: system.</li>
         * <li>1: tenant.</li>
         * <li>2: instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder configLevel(Integer configLevel) {
            this.putQueryParameter("ConfigLevel", configLevel);
            this.configLevel = configLevel;
            return this;
        }

        /**
         * <p>The entity ID corresponding to config_level.</p>
         * 
         * <strong>example:</strong>
         * <p>3b1d3031-8b6e-460a-8640-d330f2ca50b8</p>
         */
        public Builder entryId(String entryId) {
            this.putQueryParameter("EntryId", entryId);
            this.entryId = entryId;
            return this;
        }

        @Override
        public GetAsrConfigRequest build() {
            return new GetAsrConfigRequest(this);
        } 

    } 

}
