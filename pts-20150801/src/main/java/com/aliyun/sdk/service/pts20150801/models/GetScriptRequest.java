// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20150801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScriptRequest} extends {@link RequestModel}
 *
 * <p>GetScriptRequest</p>
 */
public class GetScriptRequest extends Request {
    @Query
    @NameInMap("ScriptId")
    private Integer scriptId;

    @Query
    @NameInMap("Tfsname")
    private String tfsname;

    private GetScriptRequest(Builder builder) {
        super(builder);
        this.scriptId = builder.scriptId;
        this.tfsname = builder.tfsname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scriptId
     */
    public Integer getScriptId() {
        return this.scriptId;
    }

    /**
     * @return tfsname
     */
    public String getTfsname() {
        return this.tfsname;
    }

    public static final class Builder extends Request.Builder<GetScriptRequest, Builder> {
        private Integer scriptId; 
        private String tfsname; 

        private Builder() {
            super();
        } 

        private Builder(GetScriptRequest request) {
            super(request);
            this.scriptId = request.scriptId;
            this.tfsname = request.tfsname;
        } 

        /**
         * ScriptId.
         */
        public Builder scriptId(Integer scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * Tfsname.
         */
        public Builder tfsname(String tfsname) {
            this.putQueryParameter("Tfsname", tfsname);
            this.tfsname = tfsname;
            return this;
        }

        @Override
        public GetScriptRequest build() {
            return new GetScriptRequest(this);
        } 

    } 

}
