// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLayerVersionByArnRequest} extends {@link RequestModel}
 *
 * <p>GetLayerVersionByArnRequest</p>
 */
public class GetLayerVersionByArnRequest extends Request {
    @Path
    @NameInMap("arn")
    private String arn;


    private GetLayerVersionByArnRequest(Builder builder) {
        super(builder);
        this.arn = builder.arn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLayerVersionByArnRequest create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    public static final class Builder extends Request.Builder {
        private String arn; 

        /**
         * <p>arn.</p>
         */
        public Builder arn(String arn) {
            this.putPathParameter("arn", arn);
            this.arn = arn;
            return this;
        }

        public GetLayerVersionByArnRequest build() {
            return new GetLayerVersionByArnRequest(this);
        } 

    } 

}
