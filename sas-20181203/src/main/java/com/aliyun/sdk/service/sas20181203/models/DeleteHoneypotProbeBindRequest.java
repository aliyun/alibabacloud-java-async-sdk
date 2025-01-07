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
 * {@link DeleteHoneypotProbeBindRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotProbeBindRequest</p>
 */
public class DeleteHoneypotProbeBindRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindId")
    private String bindId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProbeId")
    private String probeId;

    private DeleteHoneypotProbeBindRequest(Builder builder) {
        super(builder);
        this.bindId = builder.bindId;
        this.lang = builder.lang;
        this.probeId = builder.probeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotProbeBindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindId
     */
    public String getBindId() {
        return this.bindId;
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

    public static final class Builder extends Request.Builder<DeleteHoneypotProbeBindRequest, Builder> {
        private String bindId; 
        private String lang; 
        private String probeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotProbeBindRequest request) {
            super(request);
            this.bindId = request.bindId;
            this.lang = request.lang;
            this.probeId = request.probeId;
        } 

        /**
         * <p>The unique ID of the bound service.</p>
         * 
         * <strong>example:</strong>
         * <p>aa20815f-f0f3-4e3b-8e13-55771742****</p>
         */
        public Builder bindId(String bindId) {
            this.putQueryParameter("BindId", bindId);
            this.bindId = bindId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>The probe ID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListHoneypotProbe~~">ListHoneypotProbe</a> operation to query the IDs of probes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aa234650-cfcf-4e25-b61f-c58f603f****</p>
         */
        public Builder probeId(String probeId) {
            this.putQueryParameter("ProbeId", probeId);
            this.probeId = probeId;
            return this;
        }

        @Override
        public DeleteHoneypotProbeBindRequest build() {
            return new DeleteHoneypotProbeBindRequest(this);
        } 

    } 

}
