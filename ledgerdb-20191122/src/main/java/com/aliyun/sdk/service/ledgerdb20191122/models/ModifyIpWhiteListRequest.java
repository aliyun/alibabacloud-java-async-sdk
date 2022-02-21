// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpWhiteListRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpWhiteListRequest</p>
 */
public class ModifyIpWhiteListRequest extends Request {
    @Body
    @NameInMap("IpList")
    @Validation(required = true)
    private String ipList;

    @Body
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    @Body
    @NameInMap("ModifyType")
    @Validation(required = true)
    private String modifyType;

    private ModifyIpWhiteListRequest(Builder builder) {
        super(builder);
        this.ipList = builder.ipList;
        this.ledgerId = builder.ledgerId;
        this.modifyType = builder.modifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipList
     */
    public String getIpList() {
        return this.ipList;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    public static final class Builder extends Request.Builder<ModifyIpWhiteListRequest, Builder> {
        private String ipList; 
        private String ledgerId; 
        private String modifyType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpWhiteListRequest response) {
            super(response);
            this.ipList = response.ipList;
            this.ledgerId = response.ledgerId;
            this.modifyType = response.modifyType;
        } 

        /**
         * IpList.
         */
        public Builder ipList(String ipList) {
            this.putBodyParameter("IpList", ipList);
            this.ipList = ipList;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putBodyParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        @Override
        public ModifyIpWhiteListRequest build() {
            return new ModifyIpWhiteListRequest(this);
        } 

    } 

}
