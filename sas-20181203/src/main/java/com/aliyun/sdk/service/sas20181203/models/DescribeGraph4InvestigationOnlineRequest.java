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
 * {@link DescribeGraph4InvestigationOnlineRequest} extends {@link RequestModel}
 *
 * <p>DescribeGraph4InvestigationOnlineRequest</p>
 */
public class DescribeGraph4InvestigationOnlineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnomalyId")
    private String anomalyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnomalyUuid")
    private String anomalyUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VertexId")
    private String vertexId;

    private DescribeGraph4InvestigationOnlineRequest(Builder builder) {
        super(builder);
        this.anomalyId = builder.anomalyId;
        this.anomalyUuid = builder.anomalyUuid;
        this.lang = builder.lang;
        this.namespace = builder.namespace;
        this.vertexId = builder.vertexId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGraph4InvestigationOnlineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anomalyId
     */
    public String getAnomalyId() {
        return this.anomalyId;
    }

    /**
     * @return anomalyUuid
     */
    public String getAnomalyUuid() {
        return this.anomalyUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return vertexId
     */
    public String getVertexId() {
        return this.vertexId;
    }

    public static final class Builder extends Request.Builder<DescribeGraph4InvestigationOnlineRequest, Builder> {
        private String anomalyId; 
        private String anomalyUuid; 
        private String lang; 
        private String namespace; 
        private String vertexId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGraph4InvestigationOnlineRequest request) {
            super(request);
            this.anomalyId = request.anomalyId;
            this.anomalyUuid = request.anomalyUuid;
            this.lang = request.lang;
            this.namespace = request.namespace;
            this.vertexId = request.vertexId;
        } 

        /**
         * <p>The ID of the alert event. You can call <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> to obtain the alert event ID, with the value path being: data.SuspEvents[index].UniqueInfo.</p>
         * 
         * <strong>example:</strong>
         * <p>786fc80896b25422b5324cb6e57bxxxx</p>
         */
        public Builder anomalyId(String anomalyId) {
            this.putQueryParameter("AnomalyId", anomalyId);
            this.anomalyId = anomalyId;
            return this;
        }

        /**
         * <p>The UUID of the alert event asset. You can call <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> to obtain the asset UUID, with the value path being: data.SuspEvents[index].Uuid.</p>
         * 
         * <strong>example:</strong>
         * <p>3502e4b0-f362-4059-84a2-f47fa2b5exxx</p>
         */
        public Builder anomalyUuid(String anomalyUuid) {
            this.putQueryParameter("AnomalyUuid", anomalyUuid);
            this.anomalyUuid = anomalyUuid;
            return this;
        }

        /**
         * <p>Sets the language type for the request and response messages. The default is <strong>zh</strong>. Values:</p>
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
         * <p>The namespace of the graph, which is fixed as: hundun_dc_online.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hundun_dc_online</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Vertex ID. This does not need to be proactively provided.</p>
         * 
         * <strong>example:</strong>
         * <p>29872354f741b1b044b8a9b4e2ab****</p>
         */
        public Builder vertexId(String vertexId) {
            this.putQueryParameter("VertexId", vertexId);
            this.vertexId = vertexId;
            return this;
        }

        @Override
        public DescribeGraph4InvestigationOnlineRequest build() {
            return new DescribeGraph4InvestigationOnlineRequest(this);
        } 

    } 

}
