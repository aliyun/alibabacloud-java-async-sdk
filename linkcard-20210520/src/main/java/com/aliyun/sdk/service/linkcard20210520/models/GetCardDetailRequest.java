// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCardDetailRequest</p>
 */
public class GetCardDetailRequest extends Request {
    @Query
    @NameInMap("DestroyCard")
    private Boolean destroyCard;

    @Query
    @NameInMap("Iccid")
    @Validation(required = true)
    private String iccid;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ShowPsim")
    private Boolean showPsim;

    private GetCardDetailRequest(Builder builder) {
        super(builder);
        this.destroyCard = builder.destroyCard;
        this.iccid = builder.iccid;
        this.instanceId = builder.instanceId;
        this.showPsim = builder.showPsim;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCardDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destroyCard
     */
    public Boolean getDestroyCard() {
        return this.destroyCard;
    }

    /**
     * @return iccid
     */
    public String getIccid() {
        return this.iccid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return showPsim
     */
    public Boolean getShowPsim() {
        return this.showPsim;
    }

    public static final class Builder extends Request.Builder<GetCardDetailRequest, Builder> {
        private Boolean destroyCard; 
        private String iccid; 
        private String instanceId; 
        private Boolean showPsim; 

        private Builder() {
            super();
        } 

        private Builder(GetCardDetailRequest request) {
            super(request);
            this.destroyCard = request.destroyCard;
            this.iccid = request.iccid;
            this.instanceId = request.instanceId;
            this.showPsim = request.showPsim;
        } 

        /**
         * DestroyCard.
         */
        public Builder destroyCard(Boolean destroyCard) {
            this.putQueryParameter("DestroyCard", destroyCard);
            this.destroyCard = destroyCard;
            return this;
        }

        /**
         * Iccid.
         */
        public Builder iccid(String iccid) {
            this.putQueryParameter("Iccid", iccid);
            this.iccid = iccid;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ShowPsim.
         */
        public Builder showPsim(Boolean showPsim) {
            this.putQueryParameter("ShowPsim", showPsim);
            this.showPsim = showPsim;
            return this;
        }

        @Override
        public GetCardDetailRequest build() {
            return new GetCardDetailRequest(this);
        } 

    } 

}
