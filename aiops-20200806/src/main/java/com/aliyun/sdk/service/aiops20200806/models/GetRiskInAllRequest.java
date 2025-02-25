// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRiskInAllRequest} extends {@link RequestModel}
 *
 * <p>GetRiskInAllRequest</p>
 */
public class GetRiskInAllRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("Screen")
    private Integer screen;

    private GetRiskInAllRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.screen = builder.screen;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRiskInAllRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return screen
     */
    public Integer getScreen() {
        return this.screen;
    }

    public static final class Builder extends Request.Builder<GetRiskInAllRequest, Builder> {
        private String operaUid; 
        private Integer screen; 

        private Builder() {
            super();
        } 

        private Builder(GetRiskInAllRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.screen = request.screen;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * Screen.
         */
        public Builder screen(Integer screen) {
            this.putQueryParameter("Screen", screen);
            this.screen = screen;
            return this;
        }

        @Override
        public GetRiskInAllRequest build() {
            return new GetRiskInAllRequest(this);
        } 

    } 

}
