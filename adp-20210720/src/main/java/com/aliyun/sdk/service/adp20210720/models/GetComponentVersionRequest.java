// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetComponentVersionRequest} extends {@link RequestModel}
 *
 * <p>GetComponentVersionRequest</p>
 */
public class GetComponentVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("versionUID")
    @Validation(required = true)
    private String versionUID;

    @Query
    @NameInMap("withoutChartContent")
    private Boolean withoutChartContent;

    private GetComponentVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.versionUID = builder.versionUID;
        this.withoutChartContent = builder.withoutChartContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetComponentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return versionUID
     */
    public String getVersionUID() {
        return this.versionUID;
    }

    /**
     * @return withoutChartContent
     */
    public Boolean getWithoutChartContent() {
        return this.withoutChartContent;
    }

    public static final class Builder extends Request.Builder<GetComponentVersionRequest, Builder> {
        private String uid; 
        private String versionUID; 
        private Boolean withoutChartContent; 

        private Builder() {
            super();
        } 

        private Builder(GetComponentVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.versionUID = request.versionUID;
            this.withoutChartContent = request.withoutChartContent;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * versionUID.
         */
        public Builder versionUID(String versionUID) {
            this.putPathParameter("versionUID", versionUID);
            this.versionUID = versionUID;
            return this;
        }

        /**
         * withoutChartContent.
         */
        public Builder withoutChartContent(Boolean withoutChartContent) {
            this.putQueryParameter("withoutChartContent", withoutChartContent);
            this.withoutChartContent = withoutChartContent;
            return this;
        }

        @Override
        public GetComponentVersionRequest build() {
            return new GetComponentVersionRequest(this);
        } 

    } 

}
