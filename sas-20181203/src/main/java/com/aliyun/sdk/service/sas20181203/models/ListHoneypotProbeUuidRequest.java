// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHoneypotProbeUuidRequest} extends {@link RequestModel}
 *
 * <p>ListHoneypotProbeUuidRequest</p>
 */
public class ListHoneypotProbeUuidRequest extends Request {
    @Query
    @NameInMap("ControlNodeId")
    private String controlNodeId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ProbeType")
    private String probeType;

    private ListHoneypotProbeUuidRequest(Builder builder) {
        super(builder);
        this.controlNodeId = builder.controlNodeId;
        this.lang = builder.lang;
        this.probeType = builder.probeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHoneypotProbeUuidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return controlNodeId
     */
    public String getControlNodeId() {
        return this.controlNodeId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return probeType
     */
    public String getProbeType() {
        return this.probeType;
    }

    public static final class Builder extends Request.Builder<ListHoneypotProbeUuidRequest, Builder> {
        private String controlNodeId; 
        private String lang; 
        private String probeType; 

        private Builder() {
            super();
        } 

        private Builder(ListHoneypotProbeUuidRequest request) {
            super(request);
            this.controlNodeId = request.controlNodeId;
            this.lang = request.lang;
            this.probeType = request.probeType;
        } 

        /**
         * The ID of the management node.
         * <p>
         * 
         * >  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to obtain the ID.
         */
        public Builder controlNodeId(String controlNodeId) {
            this.putQueryParameter("ControlNodeId", controlNodeId);
            this.controlNodeId = controlNodeId;
            return this;
        }

        /**
         * The language of the content within the request and the response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The type of the probe. Valid values:
         * <p>
         * 
         * *   **host_probe**: host probe
         * *   **vpc_black_hole_probe**: virtual private cloud (VPC) probe
         */
        public Builder probeType(String probeType) {
            this.putQueryParameter("ProbeType", probeType);
            this.probeType = probeType;
            return this;
        }

        @Override
        public ListHoneypotProbeUuidRequest build() {
            return new ListHoneypotProbeUuidRequest(this);
        } 

    } 

}
