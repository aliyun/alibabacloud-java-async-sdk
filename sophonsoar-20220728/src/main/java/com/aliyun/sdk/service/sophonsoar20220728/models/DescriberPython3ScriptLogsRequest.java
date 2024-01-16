// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescriberPython3ScriptLogsRequest} extends {@link RequestModel}
 *
 * <p>DescriberPython3ScriptLogsRequest</p>
 */
public class DescriberPython3ScriptLogsRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RequestUuid")
    @Validation(required = true)
    private String requestUuid;

    private DescriberPython3ScriptLogsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.requestUuid = builder.requestUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescriberPython3ScriptLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return requestUuid
     */
    public String getRequestUuid() {
        return this.requestUuid;
    }

    public static final class Builder extends Request.Builder<DescriberPython3ScriptLogsRequest, Builder> {
        private String lang; 
        private String requestUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescriberPython3ScriptLogsRequest request) {
            super(request);
            this.lang = request.lang;
            this.requestUuid = request.requestUuid;
        } 

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UUID that is returned when the Python3 script is run.
         * <p>
         * 
         * >  You can call the [RunPython3Script](~~RunPython3Script~~) operation to query the UUID.
         */
        public Builder requestUuid(String requestUuid) {
            this.putQueryParameter("RequestUuid", requestUuid);
            this.requestUuid = requestUuid;
            return this;
        }

        @Override
        public DescriberPython3ScriptLogsRequest build() {
            return new DescriberPython3ScriptLogsRequest(this);
        } 

    } 

}
