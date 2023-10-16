// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsrConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAsrConfigRequest</p>
 */
public class GetAsrConfigRequest extends Request {
    @Query
    @NameInMap("ConfigLevel")
    private Integer configLevel;

    @Query
    @NameInMap("EntryId")
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
         * ConfigLevel.
         */
        public Builder configLevel(Integer configLevel) {
            this.putQueryParameter("ConfigLevel", configLevel);
            this.configLevel = configLevel;
            return this;
        }

        /**
         * EntryId.
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
