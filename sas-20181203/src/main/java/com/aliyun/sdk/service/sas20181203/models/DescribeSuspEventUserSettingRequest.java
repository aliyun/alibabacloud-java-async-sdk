// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventUserSettingRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspEventUserSettingRequest</p>
 */
public class DescribeSuspEventUserSettingRequest extends Request {
    @Query
    @NameInMap("From")
    private String from;

    @Query
    @NameInMap("Id")
    private Integer id;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribeSuspEventUserSettingRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
        this.id = builder.id;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspEventUserSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeSuspEventUserSettingRequest, Builder> {
        private String from; 
        private Integer id; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspEventUserSettingRequest request) {
            super(request);
            this.from = request.from;
            this.id = request.id;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The ID of the request source. Set the value to **sas**.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * The ID. You do not need to specify this parameter.
         */
        public Builder id(Integer id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The IP address of the request. You do not need to specify this parameter.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeSuspEventUserSettingRequest build() {
            return new DescribeSuspEventUserSettingRequest(this);
        } 

    } 

}
