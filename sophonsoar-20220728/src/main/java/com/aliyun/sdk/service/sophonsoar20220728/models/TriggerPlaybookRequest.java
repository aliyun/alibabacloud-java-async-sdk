// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TriggerPlaybookRequest} extends {@link RequestModel}
 *
 * <p>TriggerPlaybookRequest</p>
 */
public class TriggerPlaybookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    private TriggerPlaybookRequest(Builder builder) {
        super(builder);
        this.inputParam = builder.inputParam;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerPlaybookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputParam
     */
    public String getInputParam() {
        return this.inputParam;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<TriggerPlaybookRequest, Builder> {
        private String inputParam; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(TriggerPlaybookRequest request) {
            super(request);
            this.inputParam = request.inputParam;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * <p>The input parameters of the playbook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;input1&quot;: &quot;xx.xx.xx.xx&quot;,
         *     &quot;input2&quot;: &quot;7d&quot;
         * }</p>
         */
        public Builder inputParam(String inputParam) {
            this.putBodyParameter("InputParam", inputParam);
            this.inputParam = inputParam;
            return this;
        }

        /**
         * <p>The playbook UUID.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2a687089-d4dd-47d4-9709-xxxxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public TriggerPlaybookRequest build() {
            return new TriggerPlaybookRequest(this);
        } 

    } 

}
