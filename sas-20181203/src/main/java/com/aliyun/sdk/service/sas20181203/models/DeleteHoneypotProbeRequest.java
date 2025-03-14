// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteHoneypotProbeRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotProbeRequest</p>
 */
public class DeleteHoneypotProbeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String probeId;

    private DeleteHoneypotProbeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.probeId = builder.probeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotProbeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return probeId
     */
    public String getProbeId() {
        return this.probeId;
    }

    public static final class Builder extends Request.Builder<DeleteHoneypotProbeRequest, Builder> {
        private String lang; 
        private String probeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotProbeRequest request) {
            super(request);
            this.lang = request.lang;
            this.probeId = request.probeId;
        } 

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the probe.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95f0f79c-f7e9-4b09-a6e3-95a4cb6d****</p>
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        @Override
        public DeleteHoneypotProbeRequest build() {
            return new DeleteHoneypotProbeRequest(this);
        } 

    } 

}
