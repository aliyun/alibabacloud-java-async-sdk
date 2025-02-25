// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ocr_api20210707.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "ocr-api";
        this.version = "2021-07-07";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of RecognizeAdvanced  RecognizeAdvancedRequest
     * @return RecognizeAdvancedResponse
     */
    @Override
    public CompletableFuture<RecognizeAdvancedResponse> recognizeAdvanced(RecognizeAdvancedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeAdvanced").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeAdvancedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeAdvancedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeAirItinerary  RecognizeAirItineraryRequest
     * @return RecognizeAirItineraryResponse
     */
    @Override
    public CompletableFuture<RecognizeAirItineraryResponse> recognizeAirItinerary(RecognizeAirItineraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeAirItinerary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeAirItineraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeAirItineraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeAllText  RecognizeAllTextRequest
     * @return RecognizeAllTextResponse
     */
    @Override
    public CompletableFuture<RecognizeAllTextResponse> recognizeAllText(RecognizeAllTextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeAllText").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeAllTextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeAllTextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeBankAcceptance  RecognizeBankAcceptanceRequest
     * @return RecognizeBankAcceptanceResponse
     */
    @Override
    public CompletableFuture<RecognizeBankAcceptanceResponse> recognizeBankAcceptance(RecognizeBankAcceptanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeBankAcceptance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeBankAcceptanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeBankAcceptanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeBankAccountLicense  RecognizeBankAccountLicenseRequest
     * @return RecognizeBankAccountLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeBankAccountLicenseResponse> recognizeBankAccountLicense(RecognizeBankAccountLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeBankAccountLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeBankAccountLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeBankAccountLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeBankCard  RecognizeBankCardRequest
     * @return RecognizeBankCardResponse
     */
    @Override
    public CompletableFuture<RecognizeBankCardResponse> recognizeBankCard(RecognizeBankCardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeBankCard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeBankCardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeBankCardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeBasic  RecognizeBasicRequest
     * @return RecognizeBasicResponse
     */
    @Override
    public CompletableFuture<RecognizeBasicResponse> recognizeBasic(RecognizeBasicRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeBasic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeBasicResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeBasicResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeBirthCertification  RecognizeBirthCertificationRequest
     * @return RecognizeBirthCertificationResponse
     */
    @Override
    public CompletableFuture<RecognizeBirthCertificationResponse> recognizeBirthCertification(RecognizeBirthCertificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeBirthCertification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeBirthCertificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeBirthCertificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeBusShipTicket  RecognizeBusShipTicketRequest
     * @return RecognizeBusShipTicketResponse
     */
    @Override
    public CompletableFuture<RecognizeBusShipTicketResponse> recognizeBusShipTicket(RecognizeBusShipTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeBusShipTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeBusShipTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeBusShipTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeBusinessLicense  RecognizeBusinessLicenseRequest
     * @return RecognizeBusinessLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeBusinessLicenseResponse> recognizeBusinessLicense(RecognizeBusinessLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeBusinessLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeBusinessLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeBusinessLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeCarInvoice  RecognizeCarInvoiceRequest
     * @return RecognizeCarInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeCarInvoiceResponse> recognizeCarInvoice(RecognizeCarInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeCarInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeCarInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeCarInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeCarNumber  RecognizeCarNumberRequest
     * @return RecognizeCarNumberResponse
     */
    @Override
    public CompletableFuture<RecognizeCarNumberResponse> recognizeCarNumber(RecognizeCarNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeCarNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeCarNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeCarNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeCarVinCode  RecognizeCarVinCodeRequest
     * @return RecognizeCarVinCodeResponse
     */
    @Override
    public CompletableFuture<RecognizeCarVinCodeResponse> recognizeCarVinCode(RecognizeCarVinCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeCarVinCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeCarVinCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeCarVinCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeChinesePassport  RecognizeChinesePassportRequest
     * @return RecognizeChinesePassportResponse
     */
    @Override
    public CompletableFuture<RecognizeChinesePassportResponse> recognizeChinesePassport(RecognizeChinesePassportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeChinesePassport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeChinesePassportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeChinesePassportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeCommonPrintedInvoice  RecognizeCommonPrintedInvoiceRequest
     * @return RecognizeCommonPrintedInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeCommonPrintedInvoiceResponse> recognizeCommonPrintedInvoice(RecognizeCommonPrintedInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeCommonPrintedInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeCommonPrintedInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeCommonPrintedInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeCosmeticProduceLicense  RecognizeCosmeticProduceLicenseRequest
     * @return RecognizeCosmeticProduceLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeCosmeticProduceLicenseResponse> recognizeCosmeticProduceLicense(RecognizeCosmeticProduceLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeCosmeticProduceLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeCosmeticProduceLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeCosmeticProduceLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeCovidTestReport  RecognizeCovidTestReportRequest
     * @return RecognizeCovidTestReportResponse
     */
    @Override
    public CompletableFuture<RecognizeCovidTestReportResponse> recognizeCovidTestReport(RecognizeCovidTestReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeCovidTestReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeCovidTestReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeCovidTestReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeCtwoMedicalDeviceManageLicense  RecognizeCtwoMedicalDeviceManageLicenseRequest
     * @return RecognizeCtwoMedicalDeviceManageLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeCtwoMedicalDeviceManageLicenseResponse> recognizeCtwoMedicalDeviceManageLicense(RecognizeCtwoMedicalDeviceManageLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeCtwoMedicalDeviceManageLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeCtwoMedicalDeviceManageLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeCtwoMedicalDeviceManageLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeDocumentStructure  RecognizeDocumentStructureRequest
     * @return RecognizeDocumentStructureResponse
     */
    @Override
    public CompletableFuture<RecognizeDocumentStructureResponse> recognizeDocumentStructure(RecognizeDocumentStructureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeDocumentStructure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeDocumentStructureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeDocumentStructureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeDrivingLicense  RecognizeDrivingLicenseRequest
     * @return RecognizeDrivingLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeDrivingLicenseResponse> recognizeDrivingLicense(RecognizeDrivingLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeDrivingLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeDrivingLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeDrivingLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEduFormula  RecognizeEduFormulaRequest
     * @return RecognizeEduFormulaResponse
     */
    @Override
    public CompletableFuture<RecognizeEduFormulaResponse> recognizeEduFormula(RecognizeEduFormulaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEduFormula").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEduFormulaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEduFormulaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEduOralCalculation  RecognizeEduOralCalculationRequest
     * @return RecognizeEduOralCalculationResponse
     */
    @Override
    public CompletableFuture<RecognizeEduOralCalculationResponse> recognizeEduOralCalculation(RecognizeEduOralCalculationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEduOralCalculation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEduOralCalculationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEduOralCalculationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEduPaperCut  RecognizeEduPaperCutRequest
     * @return RecognizeEduPaperCutResponse
     */
    @Override
    public CompletableFuture<RecognizeEduPaperCutResponse> recognizeEduPaperCut(RecognizeEduPaperCutRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEduPaperCut").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEduPaperCutResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEduPaperCutResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEduPaperOcr  RecognizeEduPaperOcrRequest
     * @return RecognizeEduPaperOcrResponse
     */
    @Override
    public CompletableFuture<RecognizeEduPaperOcrResponse> recognizeEduPaperOcr(RecognizeEduPaperOcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEduPaperOcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEduPaperOcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEduPaperOcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEduPaperStructed  RecognizeEduPaperStructedRequest
     * @return RecognizeEduPaperStructedResponse
     */
    @Override
    public CompletableFuture<RecognizeEduPaperStructedResponse> recognizeEduPaperStructed(RecognizeEduPaperStructedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEduPaperStructed").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEduPaperStructedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEduPaperStructedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEduQuestionOcr  RecognizeEduQuestionOcrRequest
     * @return RecognizeEduQuestionOcrResponse
     */
    @Override
    public CompletableFuture<RecognizeEduQuestionOcrResponse> recognizeEduQuestionOcr(RecognizeEduQuestionOcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEduQuestionOcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEduQuestionOcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEduQuestionOcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEnglish  RecognizeEnglishRequest
     * @return RecognizeEnglishResponse
     */
    @Override
    public CompletableFuture<RecognizeEnglishResponse> recognizeEnglish(RecognizeEnglishRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEnglish").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEnglishResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEnglishResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeEstateCertification  RecognizeEstateCertificationRequest
     * @return RecognizeEstateCertificationResponse
     */
    @Override
    public CompletableFuture<RecognizeEstateCertificationResponse> recognizeEstateCertification(RecognizeEstateCertificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeEstateCertification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeEstateCertificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeEstateCertificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeExitEntryPermitToHK  RecognizeExitEntryPermitToHKRequest
     * @return RecognizeExitEntryPermitToHKResponse
     */
    @Override
    public CompletableFuture<RecognizeExitEntryPermitToHKResponse> recognizeExitEntryPermitToHK(RecognizeExitEntryPermitToHKRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeExitEntryPermitToHK").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeExitEntryPermitToHKResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeExitEntryPermitToHKResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeExitEntryPermitToMainland  RecognizeExitEntryPermitToMainlandRequest
     * @return RecognizeExitEntryPermitToMainlandResponse
     */
    @Override
    public CompletableFuture<RecognizeExitEntryPermitToMainlandResponse> recognizeExitEntryPermitToMainland(RecognizeExitEntryPermitToMainlandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeExitEntryPermitToMainland").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeExitEntryPermitToMainlandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeExitEntryPermitToMainlandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeFoodManageLicense  RecognizeFoodManageLicenseRequest
     * @return RecognizeFoodManageLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeFoodManageLicenseResponse> recognizeFoodManageLicense(RecognizeFoodManageLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeFoodManageLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeFoodManageLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeFoodManageLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeFoodProduceLicense  RecognizeFoodProduceLicenseRequest
     * @return RecognizeFoodProduceLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeFoodProduceLicenseResponse> recognizeFoodProduceLicense(RecognizeFoodProduceLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeFoodProduceLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeFoodProduceLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeFoodProduceLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeGeneral  RecognizeGeneralRequest
     * @return RecognizeGeneralResponse
     */
    @Override
    public CompletableFuture<RecognizeGeneralResponse> recognizeGeneral(RecognizeGeneralRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeGeneral").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeGeneralResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeGeneralResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeGeneralStructure  RecognizeGeneralStructureRequest
     * @return RecognizeGeneralStructureResponse
     */
    @Override
    public CompletableFuture<RecognizeGeneralStructureResponse> recognizeGeneralStructure(RecognizeGeneralStructureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeGeneralStructure").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeGeneralStructureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeGeneralStructureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeHKIdcard  RecognizeHKIdcardRequest
     * @return RecognizeHKIdcardResponse
     */
    @Override
    public CompletableFuture<RecognizeHKIdcardResponse> recognizeHKIdcard(RecognizeHKIdcardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeHKIdcard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeHKIdcardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeHKIdcardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeHandwriting  RecognizeHandwritingRequest
     * @return RecognizeHandwritingResponse
     */
    @Override
    public CompletableFuture<RecognizeHandwritingResponse> recognizeHandwriting(RecognizeHandwritingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeHandwriting").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeHandwritingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeHandwritingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeHealthCode  RecognizeHealthCodeRequest
     * @return RecognizeHealthCodeResponse
     */
    @Override
    public CompletableFuture<RecognizeHealthCodeResponse> recognizeHealthCode(RecognizeHealthCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeHealthCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeHealthCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeHealthCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeHotelConsume  RecognizeHotelConsumeRequest
     * @return RecognizeHotelConsumeResponse
     */
    @Override
    public CompletableFuture<RecognizeHotelConsumeResponse> recognizeHotelConsume(RecognizeHotelConsumeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeHotelConsume").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeHotelConsumeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeHotelConsumeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeHousehold  RecognizeHouseholdRequest
     * @return RecognizeHouseholdResponse
     */
    @Override
    public CompletableFuture<RecognizeHouseholdResponse> recognizeHousehold(RecognizeHouseholdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeHousehold").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeHouseholdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeHouseholdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeIdcard  RecognizeIdcardRequest
     * @return RecognizeIdcardResponse
     */
    @Override
    public CompletableFuture<RecognizeIdcardResponse> recognizeIdcard(RecognizeIdcardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeIdcard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeIdcardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeIdcardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeInternationalBusinessLicense  RecognizeInternationalBusinessLicenseRequest
     * @return RecognizeInternationalBusinessLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeInternationalBusinessLicenseResponse> recognizeInternationalBusinessLicense(RecognizeInternationalBusinessLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeInternationalBusinessLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeInternationalBusinessLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeInternationalBusinessLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeInternationalIdcard  RecognizeInternationalIdcardRequest
     * @return RecognizeInternationalIdcardResponse
     */
    @Override
    public CompletableFuture<RecognizeInternationalIdcardResponse> recognizeInternationalIdcard(RecognizeInternationalIdcardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeInternationalIdcard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeInternationalIdcardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeInternationalIdcardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeInvoice  RecognizeInvoiceRequest
     * @return RecognizeInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeInvoiceResponse> recognizeInvoice(RecognizeInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeJanpanese  RecognizeJanpaneseRequest
     * @return RecognizeJanpaneseResponse
     */
    @Override
    public CompletableFuture<RecognizeJanpaneseResponse> recognizeJanpanese(RecognizeJanpaneseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeJanpanese").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeJanpaneseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeJanpaneseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeKorean  RecognizeKoreanRequest
     * @return RecognizeKoreanResponse
     */
    @Override
    public CompletableFuture<RecognizeKoreanResponse> recognizeKorean(RecognizeKoreanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeKorean").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeKoreanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeKoreanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeLatin  RecognizeLatinRequest
     * @return RecognizeLatinResponse
     */
    @Override
    public CompletableFuture<RecognizeLatinResponse> recognizeLatin(RecognizeLatinRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeLatin").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeLatinResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeLatinResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeMedicalDeviceManageLicense  RecognizeMedicalDeviceManageLicenseRequest
     * @return RecognizeMedicalDeviceManageLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeMedicalDeviceManageLicenseResponse> recognizeMedicalDeviceManageLicense(RecognizeMedicalDeviceManageLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeMedicalDeviceManageLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeMedicalDeviceManageLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeMedicalDeviceManageLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeMedicalDeviceProduceLicense  RecognizeMedicalDeviceProduceLicenseRequest
     * @return RecognizeMedicalDeviceProduceLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeMedicalDeviceProduceLicenseResponse> recognizeMedicalDeviceProduceLicense(RecognizeMedicalDeviceProduceLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeMedicalDeviceProduceLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeMedicalDeviceProduceLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeMedicalDeviceProduceLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeMixedInvoices  RecognizeMixedInvoicesRequest
     * @return RecognizeMixedInvoicesResponse
     */
    @Override
    public CompletableFuture<RecognizeMixedInvoicesResponse> recognizeMixedInvoices(RecognizeMixedInvoicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeMixedInvoices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeMixedInvoicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeMixedInvoicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeMultiLanguage  RecognizeMultiLanguageRequest
     * @return RecognizeMultiLanguageResponse
     */
    @Override
    public CompletableFuture<RecognizeMultiLanguageResponse> recognizeMultiLanguage(RecognizeMultiLanguageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeMultiLanguage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeMultiLanguageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeMultiLanguageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeNonTaxInvoice  RecognizeNonTaxInvoiceRequest
     * @return RecognizeNonTaxInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeNonTaxInvoiceResponse> recognizeNonTaxInvoice(RecognizeNonTaxInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeNonTaxInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeNonTaxInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeNonTaxInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizePassport  RecognizePassportRequest
     * @return RecognizePassportResponse
     */
    @Override
    public CompletableFuture<RecognizePassportResponse> recognizePassport(RecognizePassportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizePassport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizePassportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizePassportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizePaymentRecord  RecognizePaymentRecordRequest
     * @return RecognizePaymentRecordResponse
     */
    @Override
    public CompletableFuture<RecognizePaymentRecordResponse> recognizePaymentRecord(RecognizePaymentRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizePaymentRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizePaymentRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizePaymentRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizePurchaseRecord  RecognizePurchaseRecordRequest
     * @return RecognizePurchaseRecordResponse
     */
    @Override
    public CompletableFuture<RecognizePurchaseRecordResponse> recognizePurchaseRecord(RecognizePurchaseRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizePurchaseRecord").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizePurchaseRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizePurchaseRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeQuotaInvoice  RecognizeQuotaInvoiceRequest
     * @return RecognizeQuotaInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeQuotaInvoiceResponse> recognizeQuotaInvoice(RecognizeQuotaInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeQuotaInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeQuotaInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeQuotaInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeRideHailingItinerary  RecognizeRideHailingItineraryRequest
     * @return RecognizeRideHailingItineraryResponse
     */
    @Override
    public CompletableFuture<RecognizeRideHailingItineraryResponse> recognizeRideHailingItinerary(RecognizeRideHailingItineraryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeRideHailingItinerary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeRideHailingItineraryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeRideHailingItineraryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeRollTicket  RecognizeRollTicketRequest
     * @return RecognizeRollTicketResponse
     */
    @Override
    public CompletableFuture<RecognizeRollTicketResponse> recognizeRollTicket(RecognizeRollTicketRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeRollTicket").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeRollTicketResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeRollTicketResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeRussian  RecognizeRussianRequest
     * @return RecognizeRussianResponse
     */
    @Override
    public CompletableFuture<RecognizeRussianResponse> recognizeRussian(RecognizeRussianRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeRussian").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeRussianResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeRussianResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeShoppingReceipt  RecognizeShoppingReceiptRequest
     * @return RecognizeShoppingReceiptResponse
     */
    @Override
    public CompletableFuture<RecognizeShoppingReceiptResponse> recognizeShoppingReceipt(RecognizeShoppingReceiptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeShoppingReceipt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeShoppingReceiptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeShoppingReceiptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeSocialSecurityCard  RecognizeSocialSecurityCardRequest
     * @return RecognizeSocialSecurityCardResponse
     */
    @Override
    public CompletableFuture<RecognizeSocialSecurityCardResponse> recognizeSocialSecurityCard(RecognizeSocialSecurityCardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeSocialSecurityCard").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeSocialSecurityCardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeSocialSecurityCardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeSocialSecurityCardVersionII  RecognizeSocialSecurityCardVersionIIRequest
     * @return RecognizeSocialSecurityCardVersionIIResponse
     */
    @Override
    public CompletableFuture<RecognizeSocialSecurityCardVersionIIResponse> recognizeSocialSecurityCardVersionII(RecognizeSocialSecurityCardVersionIIRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeSocialSecurityCardVersionII").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeSocialSecurityCardVersionIIResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeSocialSecurityCardVersionIIResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeTableOcr  RecognizeTableOcrRequest
     * @return RecognizeTableOcrResponse
     */
    @Override
    public CompletableFuture<RecognizeTableOcrResponse> recognizeTableOcr(RecognizeTableOcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeTableOcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeTableOcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeTableOcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeTaxClearanceCertificate  RecognizeTaxClearanceCertificateRequest
     * @return RecognizeTaxClearanceCertificateResponse
     */
    @Override
    public CompletableFuture<RecognizeTaxClearanceCertificateResponse> recognizeTaxClearanceCertificate(RecognizeTaxClearanceCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeTaxClearanceCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeTaxClearanceCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeTaxClearanceCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeTaxiInvoice  RecognizeTaxiInvoiceRequest
     * @return RecognizeTaxiInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeTaxiInvoiceResponse> recognizeTaxiInvoice(RecognizeTaxiInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeTaxiInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeTaxiInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeTaxiInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeThai  RecognizeThaiRequest
     * @return RecognizeThaiResponse
     */
    @Override
    public CompletableFuture<RecognizeThaiResponse> recognizeThai(RecognizeThaiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeThai").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeThaiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeThaiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeTollInvoice  RecognizeTollInvoiceRequest
     * @return RecognizeTollInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeTollInvoiceResponse> recognizeTollInvoice(RecognizeTollInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeTollInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeTollInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeTollInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeTradeMarkCertification  RecognizeTradeMarkCertificationRequest
     * @return RecognizeTradeMarkCertificationResponse
     */
    @Override
    public CompletableFuture<RecognizeTradeMarkCertificationResponse> recognizeTradeMarkCertification(RecognizeTradeMarkCertificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeTradeMarkCertification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeTradeMarkCertificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeTradeMarkCertificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeTrainInvoice  RecognizeTrainInvoiceRequest
     * @return RecognizeTrainInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeTrainInvoiceResponse> recognizeTrainInvoice(RecognizeTrainInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeTrainInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeTrainInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeTrainInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeUsedCarInvoice  RecognizeUsedCarInvoiceRequest
     * @return RecognizeUsedCarInvoiceResponse
     */
    @Override
    public CompletableFuture<RecognizeUsedCarInvoiceResponse> recognizeUsedCarInvoice(RecognizeUsedCarInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeUsedCarInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeUsedCarInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeUsedCarInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeVehicleCertification  RecognizeVehicleCertificationRequest
     * @return RecognizeVehicleCertificationResponse
     */
    @Override
    public CompletableFuture<RecognizeVehicleCertificationResponse> recognizeVehicleCertification(RecognizeVehicleCertificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeVehicleCertification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeVehicleCertificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeVehicleCertificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeVehicleLicense  RecognizeVehicleLicenseRequest
     * @return RecognizeVehicleLicenseResponse
     */
    @Override
    public CompletableFuture<RecognizeVehicleLicenseResponse> recognizeVehicleLicense(RecognizeVehicleLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeVehicleLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeVehicleLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeVehicleLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeVehicleRegistration  RecognizeVehicleRegistrationRequest
     * @return RecognizeVehicleRegistrationResponse
     */
    @Override
    public CompletableFuture<RecognizeVehicleRegistrationResponse> recognizeVehicleRegistration(RecognizeVehicleRegistrationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeVehicleRegistration").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeVehicleRegistrationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeVehicleRegistrationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RecognizeWaybill  RecognizeWaybillRequest
     * @return RecognizeWaybillResponse
     */
    @Override
    public CompletableFuture<RecognizeWaybillResponse> recognizeWaybill(RecognizeWaybillRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecognizeWaybill").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecognizeWaybillResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecognizeWaybillResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyBusinessLicense  VerifyBusinessLicenseRequest
     * @return VerifyBusinessLicenseResponse
     */
    @Override
    public CompletableFuture<VerifyBusinessLicenseResponse> verifyBusinessLicense(VerifyBusinessLicenseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyBusinessLicense").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyBusinessLicenseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyBusinessLicenseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of VerifyVATInvoice  VerifyVATInvoiceRequest
     * @return VerifyVATInvoiceResponse
     */
    @Override
    public CompletableFuture<VerifyVATInvoiceResponse> verifyVATInvoice(VerifyVATInvoiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VerifyVATInvoice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VerifyVATInvoiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VerifyVATInvoiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
